def digicode(N,L,D,C):
    if N>0:
        for i in range(C):
            if(i not in D):
                D.append(i)
                digicode(N-1,L,D,C)
                D.pop()
    else:
        L.append(D.copy())
    return L
    

print(digicode(N=3, L=[], D=[], C=4)) 
