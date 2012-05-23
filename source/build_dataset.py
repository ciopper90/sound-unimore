#!/usr/bin/env python

import os
import os.path
import sys
import pprint

import scipy.io.wavfile as wavfile

config = {
  'root_directory' : '../audio/',
  'chunk_duration' : 2,
  'sample_duration' : 0.064,
  'sample_in_chunk' : 5,
  'output_format' : 'orange',
}

def features_extraction(sample):
    # per compilare questa lista puoi richiamare funzioni esterne
    # che ricevono in input un sample
    print sample
    return [2, 2, 2]
    return

def samples_extraction(fname):
    samples = []    
    sample_rate, data = wavfile.read(fname)
    
    file_data_points = len(data)
    file_duration = file_data_points / sample_rate
    data_point_duration = 1.0 / sample_rate
    
    chunk_data_points = config['chunk_duration'] / data_point_duration
    sample_data_points = config['sample_duration'] / data_point_duration
    
    n_chunks = int(file_duration / config['chunk_duration'])
    n_sample = config['sample_in_chunk']

    chunk = 0
    while chunk < n_chunks:
        sample = 0
        while sample < n_sample:
            start_data_point = (file_data_points / n_chunks) * chunk
            start_data_point += (chunk_data_points / n_sample) * sample
            end_data_point = start_data_point + sample_data_points
            
            samples.append({
                'fname': fname,
                'chunk_id': chunk,
                'sample_id': sample,
                'data': data[start_data_point:end_data_point],
            })
            
            sample += 1
        chunk += 1
    return samples

def save(outdata):
    return
    #pprint.pprint(outdata)

def main():
    outdata = []
    
    for root, dirs, files in os.walk(config['root_directory']):
        print 'processing directory %s' % (root,)  
        for fname in files:
            if fname.lower().endswith('.wav'):
                print '- found %s' % (fname,)
                samples = samples_extraction(os.path.join(root, fname))
                for sample in samples:
                    features = features_extraction(sample)
                    features.insert(0, os.path.join(root, fname))
                    outdata.append(features)
    save(outdata)
    sys.exit()


if __name__ == '__main__':
  main()



