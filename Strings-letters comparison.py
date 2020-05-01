"""
INPUT:
read
dear
OUTPUT:
YES
INPUT:
record
decoder
OUTPUT:
YES
INPUT:
energy
synergy
OUTPUT:
NO
"""
s=input().strip()
s1=input().strip()
s=list(s)
s1=list(s1)
for i in range(0,len(s)):
    for j in range(i+1,len(s)):
        if s[i]==s[j]:
            s[j]=""
for i in range(0,len(s1)):
    for j in range(i+1,len(s1)):
        if s1[i]==s1[j]:
           s1[j]=""
count=0
for i in range(0,len(s)):
    if s[i] in s1:
        count+=1
if count==len(s):
    print("YES")
else:
    print("NO")
