"""
INPUT:
305
794
OUTPUT:
1
"""
x=int(input())
y=int(input())
temp,temp1,sum,sum1,s=x,y,0,0,0
while(x>0):
    sum=(sum*10)+(x%10)
    x=int(x/10)
while(y>0):
    sum1=(sum1*10)+(y%10)
    y=int(y/10)
a=sum+sum1
b=a
while(a>0):
    s=(s*10)+(a%10)
    a=int(a/10)
print(s)