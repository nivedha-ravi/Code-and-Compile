"""
INPUT:
1 4 7
5
OUTPUT:
13
"""

string=input()
x,y,z=string.split(" ")
n=int(input())
x,y,z=int(x),int(y),int(z)
print(x+(n-1)*abs(y-z))
