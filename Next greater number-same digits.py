"""
input:
195

output:
519
"""
a=input().strip()
l=list(a)
l.sort()
l="".join(l[::-1])
for i in range(int(a)+1,int(l)+1):
    c,d=0,str(i)
    for j in d:
        if d.count(j)==a.count(j):
            c+=1
    if(c==len(a)):
        print(i)
        break
