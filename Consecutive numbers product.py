"""
INPUT:
6
Output:
Yes
INPUT:
36
Output:
No
"""
import math
a=int(input())
x=(int)(math.sqrt(a))
if(x*(x+1)==a):
    print("Yes")
else:
    print("No")
