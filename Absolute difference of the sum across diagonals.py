"""
INPUT:
2
10 9
4 22
OUTPUT:
19
"""
n=int(input())
l=[]
for i in range(n):
    l.append(list(map(int,input().strip().split())))
sum1,sum2=0,0
for i in range(n):
    sum1+=l[i][i]
    sum2+=l[i][n-1-i]
if sum1<0 and sum2>0:
    print(abs(sum1+sum2))
else:
    print(abs(sum1-sum2))
