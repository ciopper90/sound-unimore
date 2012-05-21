from acq import *
import caricapy as caricapy
from feature import feature
import string


indirizzo="../audio/"
tempo_campione=0.064
tipo_campionamento='n'
numero_campioni=5



#file=caricapy.pycartella(indirizzo)
d=caricapy.carica("../audio/file.csv")
print d
print len(d)

#lettura di ogni singolo file e creazione del file tab per orange

#f= open('audio.tab','w')
#f.write("ciao \t come \t va\n")
#f.write("qui \t tutto \t molto \t bene")
#f.close()
v=[]
rate=[]
for i in range(len(d)):
	print d[i][0]	
	test , rat = acquisizione(indirizzo+d[i][0]+".wav",tempo_campione,numero_campioni,tipo_campionamento)
	v.append(test)
	rate.append(rat)
	#print rat
	#print len(v)
	#print len(v[1])
	#print v
file= open('audio.tab','w')
#vf=[]
print len(v)
for i in range(len(v)):
	#f=[]
	for k in range(len(v[i])):
		#f.append(feature(v[i][k],rate[i]))
		f=feature(v[i][k],rate[i])
		#print d[i][0]
		if i==0 and k==0:
			file.write("tipo\tname\t")
			for h in f:
				file.write(h+"\t")
			file.write("\n")
			file.write("d\td\t")
			for h in f:
				file.write("c\t")
			file.write("\nclass\n")
		file.write(d[i][0][:string.find(d[i][0],"_")]+"\t"+d[i][0]+"_"+str(k).zfill(2)+"\t")
                for h in f.values():
                	file.write(str(h)+"\t")
                file.write("\n")

		#file.write(d[i][0][:string.find(d[i][0],"_")]+"\t"+d[i][0]+"_"+str(k)+"\t"+str(f)+"\n")
	#vf.append(f)


#f= open('audio.tab','w')
#for i in vf:
#	f.write(str(i[0])+"\t"+str(i[1])+"\n")
#f.write("qui \t tutto \t molto \t bene")
file.close()
#for i in vf:
#	print i
#print vf
#print v
