#permette di estrarre tutti i nomi dei file che finiscono per .wav da
#una cartella
import os


def pycartella(indirizzo):
        file=[]
        list=os.listdir(indirizzo)
        for infile in list:
                if infile[-3:]==".py":
                        file.append(infile)
        file.sort()
        return file

#eventualmente il dizionario si puo sotituire con una lista cosi che 
#per ogni file si possono mantenere molte piu informazioni
def carica(indirizzo):
	d=[]
	f = open(indirizzo,'r')
	riga = f.readlines()
	for i in riga:
		meta=i.split(';')
		c=[meta[0],meta[1][:-1]]
		d.append(c)
	return d
