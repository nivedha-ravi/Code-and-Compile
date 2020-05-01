"""
INPUT:
20 30 40
50 10
OUTPUT:
150
"""
a=list(map(int,input().strip().split()))
b=list(map(int,input().strip().split()))
t1,t2=0,0
for i in range(len(a)):
    if(a[i]<0):
        print("INVALIDINPUT")
        quit()
    else:
        t1+=a[i]
for j in range(len(b)):
    if b[j]<0:
        print("INVALIDINPUT")
        quit()
    else:
        t2+=b[j]
avg1=t1/len(a)
avg2=t2/len(b)
if(avg1==avg2):
    print(t1 if t1>t2 else t2)
elif avg1>avg2:
    print(t1)
else:
    print(t2)
