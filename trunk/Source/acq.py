import scipy.io.wavfile as wavfile
import math
import sys

def acquisire_audio(name):
	rate,data= wavfile.read(name)
	return data,rate

def lista(file,framerate,bit,strategia,temp,ncampioni):
	file_wav=[]
	tempo_cp=(1.0)/framerate
	#print tempo_cp
	ncamp=(temp/tempo_cp)
        ncamp=math.trunc(ncamp)
	#print 'ncampioni='+str(ncamp)	
	maxcamp=len(file)/ncamp
	#print 'maxcamp='+str(maxcamp)
	for i in range(maxcamp):
		file_wav.append(file[i*ncamp:ncamp*i+ncamp])
	#print 'lunghezza=',len(file_wav)
	#print file_wav[0]
	#print file[0:maxcamp]
	if strategia == 'a':
		return file_wav
	elif strategia == 'f':
		return file_wav[-ncampioni:]
	elif strategia == 'i':
		return file_wav[:ncampioni]
	elif strategia == 'n':
		a=maxcamp/ncampioni
		#print 'a=' +str(a)
		if ncampioni > len(file_wav):
			return file_wav
		for i in range(ncampioni):
			#print i*a
			file_wav[i]=file_wav[i*a]
		return file_wav[:ncampioni]	

def acquisizione(name,tempo,ncampioni,strategia):
	#1 parametro in ingresso il nome
        #2 parametro lunghezza campione
        #terzo parametro facoltativo il numero di pezzetti del file da usare
        #4 parametro strategia di estrazione
        #print strategia
        wav, rate=acquisire_audio(name)
	print name
	#print len(wav)
	#print rate
        file=lista(wav,rate,2,strategia,tempo,ncampioni) #framerate,bit)
#        print len(wav)
	return file,rate

#if __name__ == '__main__':
	#1 parametro in ingresso il nome
	#sys.argv[1]= nome del file
	#2 parametro lunghezza campione
#	temp=float(sys.argv[2])
	#terzo parametro facoltativo il numero di pezzetti del file da usare
#	if len(sys.argv) >= 4:
#		ncampioni=int(sys.argv[3])
	#4 parametro strategia di estrazione
#	if len(sys.argv) == 5:
#		strategia=sys.argv[4]
#	else:
#		strategia='a'
	#print strategia
#	wav, rate=acquisire_audio('/home/ciopper90/audio/'+sys.argv[1]+'.wav')
	#print rate
#	wav=lista(wav,rate,2,strategia) #framerate,bit)
	#print len(wav)
