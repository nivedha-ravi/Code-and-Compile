"""
input:
10 20 30 20 30 10 30 20
output:
20

explantion:
both 20 and 30 maximum and equal no of counts but min of 2 elements is printed
"""
a=[int(i) for i in input().split()]
b=dict((i,a.count(i)) for i in a)
c,d=list(b.keys()),list(b.values())
print(c[d.index(max(d))])
