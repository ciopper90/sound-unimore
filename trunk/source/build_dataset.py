#!/usr/bin/env python

import os
import os.path
import sys
import audioop
import struct
import pprint
import wave

import numpy as np

config = {
  'root_directory' : '../dataset/',
  'chunk_duration' : 2,
  'sample_duration' : 0.064,
  'sample_in_chunk' : 3,
  'output_format' : 'orange',
  'output_filename' : 'dataset'
}

def features_extraction(sample):
    sample_rate = sample['sample_rate']
    sample_width = sample['sample_width']
    signal = sample['data']
    
    # zero crossing rate
    sample['zcr'] = float(audioop.cross(signal, sample_width)) / len(signal)
    
    
    # low energy frame rate
    rms = audioop.rms(signal, sample_width) / 2    
    lefr = 0
    for data_point in signal:
        if data_point < rms: 
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
    return

def samples_extraction(fname):
    wav = wave.open(fname, 'r')
    (nchannels, sample_width, sample_rate, n_frames, comptype, compname) = wav.getparams()
    frames = wav.readframes(n_frames * nchannels)
    out = struct.unpack_from ("%dh" % n_frames * nchannels, frames)
    wav.close()
    
    print '  - %s [%dch, %dbits, %dhz, %ds]' % (
        fname, nchannels, sample_width * 8, sample_rate, n_frames / sample_rate)
    
    # eventual mono conversion
    data = np.array([out[i] for i in range(0, len(out), nchannels)])
               
    file_duration = n_frames / sample_rate
    data_point_duration = 1.0 / sample_rate
    chunk_data_points = config['chunk_duration'] / data_point_duration
    sample_data_points = config['sample_duration'] / data_point_duration
    n_chunks = int(file_duration / config['chunk_duration'])
    n_sample = config['sample_in_chunk']

    samples = []
    chunk = 0
    
    # TOBEFIXED
    if n_chunks > 100:
	n_chunks = 100
    
    while chunk < n_chunks:
        sample = 0
        while sample < n_sample:
            start_data_point = (n_frames / n_chunks) * chunk
            start_data_point += (chunk_data_points / n_sample) * sample
            end_data_point = start_data_point + sample_data_points
            
            samples.append({
                'fname': fname,
                'chunk_id': chunk,
                'sample_id': sample,
                'sample_rate' : sample_rate,
                'sample_width' : sample_width,
                'data': data[start_data_point:end_data_point],
            })
            
            sample += 1
        chunk += 1
    return samples

def save_orange(samples):
    outstr = []
    for sample in samples:
        filename = os.path.basename(sample['fname'])
        name, ext = os.path.splitext(filename)
        classname = name.split('_')[0]
        id = '%s_%s_%s' % (name, 
            str(sample['chunk_id']).zfill(3), 
            str(sample['sample_id']).zfill(3))
        
        outstr.append('%s\t%s\t%f\t%f\t%f' % (
            classname,
            id,
            sample['sc'],
            sample['lefr'],
            sample['zcr']))
            
    out_file = open(config['output_filename'] + '.tab', 'w')
    out_file.write('\n'.join(outstr))
    out_file.close()
    return
    
def save_weka(samples):
    outstr = []
    for sample in samples:
        filename = os.path.basename(sample['fname'])
        name, ext = os.path.splitext(filename)
        classname = name.split('_')[0]
        id = '%s_%s_%s' % (name, 
            str(sample['chunk_id']).zfill(3), 
            str(sample['sample_id']).zfill(3))
        
        outstr.append('%f,%f,%f,%s,%s' % (
            sample['sc'],
            sample['lefr'],
            sample['zcr'],
            id,
            classname))
            
    out_file = open(config['output_filename'] + '.arff', 'w')
    out_file.write('\n'.join(outstr))
    out_file.close()
    return

def main():
    samples = []
    for root, dirs, files in os.walk(config['root_directory']):
        print 'processing directory %s' % (root,)  
        for fname in files:
            if fname.lower().endswith('.wav'):
                current = samples_extraction(os.path.join(root, fname))
                
                for sample in current:
                    features_extraction(sample)
                
                samples.extend(current)
                    
    if config['output_format'] == 'orange':
        save_orange(samples)
    else:
        save_weka(samples)
        
    sys.exit()

if __name__ == '__main__':
  main()



