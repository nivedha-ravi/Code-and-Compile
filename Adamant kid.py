"""
input:
cake
2 12
output:
NO
"""
s=list(input().strip())
x,y=map(int,input().split())
if y//len(s)>=len(s):
    y=(y//len(s))//len(s)-1
else:
    y=(y//len(s))
if s[x]==s[y]:
    print("YES")
else:
    print("NO")
