"""
input:
3
2
4 5 9
1 3 5
8 2 4
3 5
2 4

output:
TRUE
"""
n=int(input())
m=int(input())
l=[]
li=[]
for i in range(n):
    l.append(list(map(int,input().split())))
for i in range(m):
    li.append(list(map(int,input().split())))
c1=0
for i in range(n):
    for j in range(n):
        if i+m<=n and j+m<=n:
            c=[[l[i][j] for j in range(j,j+m)]for i in range(i,i+m)]
            if(c==li):
                c1+=1
                print("TRUE")
                break
if(c1==0):
    print("FALSE")
