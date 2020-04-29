"""INPUT:
china
india
OUTPUT:
3
"""
s1=input()
s2=input()
s1=list(s1)
s2=list(s2)
r=0
for i in range(len(s1)):
    c=0
    for j in range(len(s2)):
        if s1[i]==s2[j]:
            s2[j]='*'
            c+=1
    if c>0:
        r+=1
print(r)
