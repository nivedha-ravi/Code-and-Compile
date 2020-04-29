"""INPUT:
4a5h
OUTPUT:
aaaahhhhh
"""
strval=input().strip()
b=""
for i in strval:
    if i.isdigit():
        b="".join([b,i])
    else:
        print(int(b)*i,end="")
        b=""
