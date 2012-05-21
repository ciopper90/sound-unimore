import audioop
import wave
import struct
import numpy as np
from numpy.fft import rfft
import scipy.io.wavfile as wavfile
#funzione usata per calcolare il crossing rate
#in ingresso servono due parametri il primo e il frammento audio
#il secondo e la dimensione del frammento 1(8bit) 2(16 bit) o 4(32bit)

def zcr(fragment,size):		#zero crossing rate
	return (audioop.cross(fragment,size)*1.0)/len(fragment)
#	zcr = 0
#        for i in range(1,len(fragment)):
#                #print i
#		left = fragment[i]    #[0:2] left
#		prev = fragment[i-1]
		#right = val[2:4]
        	#print left        
#		v = struct.unpack('h', left )[0]
                #print struct.unpack('h', right)
#                prev=fragment[i-1]
#                c= struct.unpack('h', prev)[0]
#                zcr=zcr+np.abs(np.sign(left)-np.sign(prev))
#	return (zcr*1.0)/(2*len(fragment))

def lefr(fragment,size):	#low energy frame rate
	count=0
	rms=audioop.rms(fragment,size)
	rms=rms/2
	#print rms
	#rate , data = wavfile.read("/home/ciopper90/audio/01.wav")
	for i in range(len(fragment)):
		if fragment[i] < rms:
			count=count+1
		#print i
	return count

def sc1(signal):	#spectral centroid
	spectrum = np.abs(rfft(signal))
	normalized_spectrum = spectrum / np.sum(spectrum) # like a probability mass function
	normalized_frequencies = np.linspace(0, 1, len(spectrum))
	spectral_centroid = np.sum(normalized_frequencies * normalized_spectrum)
	return spectral_centroid
	#da moltiplicare per la massima frequenza

def sc(signal,rata):
	p = np.abs(rfft(signal))
        f = np.linspace(0, rata/2.0, len(p))
	#print len(p)
	#print len(f)
	num=0
	for i in range(len(f)):
		num=num+(i*(p[i])**2)
	den=0
	for i in range(len(f)):
		den=den+((p[i])**2)
	return (num*1.0)/den
	

def feature(file_wav,rate):
	#rate , wava = wavfile.read("/home/ciopper90/audio/01.wav")
        #wa=audioop.tomono(wa,2,1,1)
        #print rate
        #print len(wava)
        caratteristiche={}
	caratteristiche['zcr'] = zcr(file_wav,2)
        caratteristiche['lefr'] = lefr(file_wav,2)
        caratteristiche['sc'] = sc(file_wav,rate)
        #print 'spectral centroid: ' ,sc1(wava)
	return caratteristiche

#if __name__ == '__main__':
	#wav=wave.open('/home/ciopper90/audio/01.wav','r')
	#wa=wav.readframes(wav.getnframes())
#	rate , wava = wavfile.read("/home/ciopper90/tesi/audio/so.wav")
	#wa=audioop.tomono(wa,2,1,1)
	#print wava
#	print wava[0]
#	print "rate: "+str(rate)
#	print "frame totali: "+str(len(wava))
#	print 'zcr: ',zcr(wava,2)
#	print 'low energy frame rate: ',lefr(wava,2)
#	print 'spectral centroid: ', sc(wava)
#	print 'spectral centroid: ' ,sc1(wava)
