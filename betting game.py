string=input()
l=list(string.split())
x=int(input())
y=int(input())
t=0
for i in range(len(l)):
    l[i]=int(l[i])
    if l[i]%2!=0:
        t=t+x
    else:
        t=t-y
print(t)
