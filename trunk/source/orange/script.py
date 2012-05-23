if not in_data == None:
    print len(in_data)
    usare=list(in_data)
    vecchia=str(in_data[0][0])[:-3]
    scelte={}
    test=""
    #print in_data[0]["tipo(Interactive Tree Builder)"]
    for k in range(len(in_data)):
        i=in_data[k]
        nuova=str(i[0])[:-3]
        if vecchia != nuova:   
            #print scelte
            vecchia=nuova
            #print max(scelte, key=scelte.get)
            #aggiungere il tutto ad out data
            in_data[k-5]["tipo(Interactive Tree Builder)"]=max(scelte, key=scelte.get)
            scelte={}
    
    
        #calcolo tipi per ogni gruppo di campioni
        test= str(i["tipo(Interactive Tree Builder)"])
        if scelte.has_key(test):   
            scelte[test] = scelte[test] +1
            #print scelte[test]
        else:
            scelte[test]=1

    lung=len(in_data)
    i=0
    while i < lung:
        if not "00" in str(in_data[i][0]):
            del in_data[i]
            lung =lung - 1
            print lung
            i= i-1
        if lung < i+1:
            print "a"
            break;
        i=i+1
    out_data=in_data
