def lancer_de(d,L,D,n):
    
    if d>0:
        for i in range(1,n+1):
            D.append(i)
            lancer_de(d-1,L,D,n)
            D.pop()
    else:
        L.append(list(D))
    return L
        
print(lancer_de(3,[],[],2))
