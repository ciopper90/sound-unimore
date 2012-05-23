if not in_data == None:
    #extract learner name
    classifier=in_data[0].get_metas(str).keys()[0]
    #print classifier
    #print len(in_data)
    
    first_sample=str(in_data[0][0])[:-3]
    select={}
    type=""
    for k in range(len(in_data)):
        i=in_data[k]
        new_sample=str(i[0])[:-3]
        #compare the name of sample
        if first_sample != new_sample:   
            first_sample=new_sample
            #modify class ok in_data element
            in_data[k-5][classifier]=max(select, key=select.get)
            #reset select
            select={}
    
    
        #extract type
        type= str(i[classifier])
        if select.has_key(type):   
            select[type] = select[type] +1
        else:
            select[type]=1

    lung=len(in_data)
    i=0
    while i < lung:
        if not "_00" in str(in_data[i][0])[-3:]:
            del in_data[i]
            lung =lung - 1
            #print lung
            i= i-1
        i=i+1
    print len(in_data)
    out_data=in_data
