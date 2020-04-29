"""
input: 120D6
output: 20

here
a or A = add
s or S = sub
m or M = product
d or D = divide
"""
a=input().strip()
b=""
for i in a:
    if i.isalpha():
        b="".join(str(i))
c,d=int(a[:a.index(b)]),int(a[a.index(b)+1:])
b=b.lower()
if b=='a':
    print(c+d)
elif b=='s':
    print(c-d)
elif b=='m':
    print(c*d)
elif b=='d':
    print(c//d)
