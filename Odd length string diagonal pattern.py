"""
INPUT:
cry
OUTPUT:
c y
 r
c y
"""
s=input().strip()
s=list(s)
length=len(s)
for i in range(length):
    g=length-i-1
    for j in range(length):
        if i==j:
            print(s[j],end="")
        elif j==g:
            print(s[j],end="")
        else:
            print(" ",end="")
    print()
