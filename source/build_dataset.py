#!/usr/bin/env python

import gc
import os
import os.path
import sys
import audioop
import struct
import pprint
import wave
import math

import entropy

import numpy as np

config = {
  'root_directory' : '../dataset/testset/',
  'labels_file' : 'labels.csv',
  'labels_index' : 0,
  'chunk_duration' : 3,
  'sample_duration' : 0.064,
  'sample_in_chunk' : 3,
  'output_format' : 'weka',
  'output_filename' : 'dataset'
}

def features_extraction(sample):
    sample_rate = sample['sample_rate']
    sample_width = sample['sample_width']
    signal = sample['data']
    
    # zero crossing rate
    zcr = 0
    before = signal[0]    
    for i in range(1, len(signal)):
        after = signal[i]
        zcr = zcr + np.abs(cmp(after, 0) - cmp(before, 0))
        before = after
    sample['zcr'] = float(zcr) / (2 * len(signal))


    # low energy frame rate
    sum = 0;
    for i in range(len(signal)):
        sum = sum + (math.pow(signal[i], 2))
    sum = sum / len(signal)
    rms = math.sqrt(sum) / 2
    lefr = 0
    for i in range(len(signal)):
        if(signal[i] < rms):
            lefr += 1
    sample['lefr'] = lefr

    
    # spectral centroid
    p = np.abs(np.fft.rfft(signal))
    f = np.linspace(0, sample_rate / 2.0, len(p))
    num = den = 0.0
    for i in range(len(f)):
        num = num + (i * (p[i] * p[i]))
    for i in range(len(f)):
        den = den + ((p[i] * p[i]))
    sample['sc'] = num / den
    

    # entropy
    map = {}
    for i in range(0, len(signal)):
        try :
            map[signal[i]] = map[signal[i]] + 1
        except KeyError:
            map[signal[i]] = 1
    
    result = 0.0
    for i in map.keys():
        frequency = float(map[i]) / len(signal)
        result -= frequency * (math.log10(frequency) / math.log10(2))
    sample['entropy'] = result
    return


def samples_extraction(root, fname, cname):
    wav = wave.open(os.path.join(root, fname), 'r')
    (nchannels, sample_width, sample_rate, n_frames, comptype, compname) = wav.getparams()
    
    print '  - %s [%dch, %dbits, %dhz, %ds]' % (
        fname, nchannels, sample_width * 8, sample_rate, n_frames / sample_rate)
               
    file_duration = n_frames / sample_rate
    data_point_duration = 1.0 / sample_rate
    chunk_data_points = int(config['chunk_duration'] / data_point_duration)
    sample_data_points = int(config['sample_duration'] / data_point_duration)
    n_chunks = int(file_duration / config['chunk_duration'])
    n_sample = config['sample_in_chunk']
    
    samples = []
    
    # TOBEFIXED
    if n_chunks > 100:
        n_chunks = 100
    
    chunk = 0
    while chunk < n_chunks:
        sample = 0
        while sample < n_sample:
            start_data_point = (n_frames / n_chunks) * chunk
            start_data_point += (chunk_data_points / n_sample) * sample
            
            wav.setpos(start_data_point)
            frames = wav.readframes(sample_data_points)
            frames_conv = struct.unpack_from ("%dh" % sample_data_points * nchannels, frames)
            # reduces the number of channels to one
            data = np.array([frames_conv[i] for i in range(0, len(frames_conv), nchannels)])
            
            samples.append({
                'root' : root,
                'fname': fname,
                'class' : cname,
                'chunk_id': chunk,
                'sample_id': sample,
                'sample_rate' : sample_rate,
                'sample_width' : sample_width,
                'data': data,
            })
            
            sample += 1
        chunk += 1
        
    wav.close()
    return samples

def save_orange(samples):
    outstr = []
    for sample in samples:
        filename = os.path.basename(sample['fname'])
        name, ext = os.path.splitext(filename)
        
        outstr.append('%s\t%s\t%f\t%f\t%f\t%f' % (
            sample['class'],
            '%s_%s_%s' % (name, str(sample['chunk_id']).zfill(3), str(sample['sample_id']).zfill(3)),
            sample['sc'],
            sample['lefr'],
            sample['zcr'],
            sample['entropy']))
            
    # open output file
    out_file = open(config['output_filename'] + '.tab', 'w')
    
    # write header
    out_file.write('type\tname\tsc\tlefr\tzcr\tentropy\n')
    out_file.write('d\td\tc\tc\tc\tc\n')
    out_file.write('class\n')
    
    # write body
    out_file.write('\n'.join(outstr))
    out_file.close()
    return
    
def save_weka(samples):
    outstr = []
    for sample in samples:
        filename = os.path.basename(sample['fname'])
        name, ext = os.path.splitext(filename)
        
        outstr.append('%f,%f,%f,%f,%s,%s' % (
            sample['sc'],
            sample['lefr'],
            sample['zcr'],
            sample['entropy'],
            '%s_%s_%s' % (name, str(sample['chunk_id']).zfill(3), str(sample['sample_id']).zfill(3)),
            sample['class'],            
            ))
            
    # open output file
    out_file = open(config['output_filename'] + '.arff', 'w')
    
    # write header
    out_file.write('@relation \'dataset\'\n\n')
    out_file.write('@attribute sc numeric\n')
    out_file.write('@attribute lefr numeric\n')
    out_file.write('@attribute zcr numeric\n')
    out_file.write('@attribute entropy numeric\n')
    out_file.write('@attribute name string\n')
    out_file.write('@attribute class {parco,lezione,treno,tv,auto,ristorante,strada}\n\n')
    out_file.write('@data\n')
    
    # write body
    out_file.write('\n'.join(outstr))
    out_file.close()
    return

def main():
    samples = []
    
    # build the filename/class mappings
    class_map = {}
    for line in open(os.path.join(config['root_directory'], config['labels_file'])):
        # skip comments
        if line[0] == '#': continue
        classes = line.split(',')
        fname = classes.pop(0)
        class_map[fname] = classes
    
    # main loop
    for root, dirs, files in os.walk(config['root_directory']):
        print 'processing directory %s' % (root,)  
        for fname in files:
            if fname.lower().endswith('.wav'):
                try:
                    current = samples_extraction(
                        root, 
                        fname, 
                        class_map[fname][config['labels_index']])
                    for sample in current:
                        features_extraction(sample)
                    samples.extend(current)
                except KeyError:
                    print 'warning: %s not found in dataset\n' % (fname)
                    

    if config['output_format'] == 'orange':
        save_orange(samples)
    else:
        save_weka(samples)
    sys.exit()
    
        
if __name__ == '__main__':
  main()



