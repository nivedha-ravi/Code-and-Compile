"""
INPUT:
2
10 9
4 22
OUTPUT:
45
"""
n=int(input())
l=[]
sum1=0
for i in range(n):
    l.append(list(map(int,input().strip().split())))
for i in range(n):
    for j in range(n):
        if i==j or i==n-j-1:
            sum1+=l[i][j]
print(sum1)
