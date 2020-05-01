"""
INPUT:
3 5 1
3 2 0
OUTPUT:
7 1
"""
a=list(map(int,input().strip().split()))
b=list(map(int,input().strip().split()))
A,B=0,0
for i in range(len(a)):
    if a[i]==b[i]:
        A+=1
        B+=1
    elif a[i]>b[i]:
        A+=3
    else:
        B+=3
print(A,B,end=" ")
