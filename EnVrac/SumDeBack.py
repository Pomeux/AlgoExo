def sum_de(n,k,L,D,target):
    if n>0:
        for i in range(k+1):
            D.append(i)
            sum_de(n-1,k,L,D,target)
            D.pop()
    else:
        D=list(D)
        if sum(list(D))==target:
            L.append(D)
    return L
    
print(sum_de(2,6,[],[],7))
