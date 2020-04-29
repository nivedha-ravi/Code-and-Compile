"""
INPUT:
malayalam
a
l
OUTPUT:
2
"""
s=input().strip()
a=input().strip()
b=input().strip()
c=0
for i in range(0,len(s)-1):
    if s[i]==a and s[i+1]==b:
        c+=1
print(c)
