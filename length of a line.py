"""
INPUT:
0 4
3 0
OUTPUT:
5.00
"""
import math
x1,y1=input().split(" ")
x2,y2=input().split(" ")
x1,x2,y1,y2=int(x1),int(x2),int(y1),int(y2)
t=float(abs(x1-x2))
t1=float(abs(y1-y2))
length="{:.2f}".format(math.sqrt((t*t)+(t1*t1)))
print(length)
