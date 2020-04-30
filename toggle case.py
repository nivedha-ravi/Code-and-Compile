"""
INPUT:
R@1nBow
OUTPUT:
r@1nBow
"""
s=input().strip()
s=list(s)
for i in range(len(s)):
    if s[i].isupper():
        print(s[i].lower(),end="")
    elif s[i].islower():
        print(s[i].upper(),end="")
    else:
        print(s[i],end="")
