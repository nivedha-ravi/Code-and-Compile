s=list(input().strip())
c=1
for i in range(0,len(s)):
    if s[i]=='T' or s[i]=='D' or s[i]=='F' or s[i]=='L':
        c=c*2
print(c)
