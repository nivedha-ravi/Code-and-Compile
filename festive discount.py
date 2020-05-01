"""
INPUT:
3
1000
1200
400
OUTPUT:
1500.00
"""
n=int(input())
l=[]
for i in range(n):
    t=int(input())
    l.append(t)
sum1=0
for i in range(n):
    if l[i]>400 and l[i]<=500:
        d=l[i]*float(20/100)
        c=l[i]-d
        sum1=sum1+c
    elif l[i]>500 and l[i]<1000:
        d=l[i]*float(25/100)
        c=l[i]-d
        sum1=sum1+c
    elif l[i]>=1000:
        d=l[i]*float(50/100)
        c=l[i]-d
        sum1=sum1+c
    else:
        sum1=sum1+l[i]
if(sum1>2000):
    a="{:.2f}".format(float(sum1-100.0))
    print(a)
else:
    a="{:.2f}".format(float(sum1))
    print(a)
