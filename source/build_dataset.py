#!/usr/bin/env python

import os
import os.path
import sys
import pprint

import scipy.io.wavfile as wavfile

config = {
  'root_directory' : '../audio/',
  'sample_duration' : 0.064,
  'sample_number' : 5,
  'output_format' : 'orange',
}

def features_extraction(sample):
    # per compilare questa lista puoi richiamare funzioni esterne
    # che ricevono in input un sample
    return [2, 2, 2]
    return

def samples_extraction(fname):
    samples = []    
    sample_rate, data = wavfile.read(fname)
    
    data_point_duration = 1.0 / sample_rate
    sample_data_points = config['sample_duration'] / data_point_duration
    
    n = 0
    start_point = 0
    step = len(data) / config['sample_number']
    while n < config['sample_number']:
        start_data_point = (len(data) / config['sample_number']) * n
        end_data_point = start_data_point + sample_data_points
        samples.append(data[start_data_point:end_data_point])
        n += 1
    return samples

def save(outdata):
    pprint.pprint(outdata)

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



