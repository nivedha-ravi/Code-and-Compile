"""
input:
5
ouput:
1 6 10 13 15
2 7 11 14
3 8 12
4 9
5
"""
n=int(input())
y,x,k,a=1,1,0,0
for i in range(n,0,-1):
    z,k=n,y
    print(y,end=" ")
    for j in range(1,i):
        if j>0:
            a+=n-j+k+1
            print(a,end=" ")
        z-=1
        k=0
    print()
    y+=1
    k=y
    a=0
