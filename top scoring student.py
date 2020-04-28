"""
INPUT:
4
Sasikumar:50:60:70
Arun:60:40:90
Manoj:50:50:60
Rekha:60:35:45
OUTPUT:
Arun
"""


n=int(input())
max=0
for i in range(n):
    inp=input().split()
    for j in range(len(inp)):
        name,m,p,c=inp[j].split(':')
        m,p,c=int(m),int(p),int(c)
        sum=m+p+c
        if sum>max:
            max=sum
            maxstud=name
print(maxstud)
