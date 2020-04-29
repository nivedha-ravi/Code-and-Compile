"""INPUT:
38
70
OUTPUT:
7
"""
n1=int(input())
n2=int(input())
c=0
for i in range(n1,n2+1):
    flag=0
    for j in range(2,i):
        if(i%j==0):
            flag=1
            break
    if(flag==0 and not(i==1)):
        c+=1
print(c)
