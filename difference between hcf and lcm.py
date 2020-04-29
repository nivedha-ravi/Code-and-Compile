"""
INPUT:
30
45
OUTPUT:
75
"""
def findHcf(a,b):
    return a if b==0 else findHcf(b,a%b)
n1=int(input())
n2=int(input())
gcd=findHcf(n1,n2)
lcm=(n1*n2)//gcd
print(abs(lcm-gcd))
