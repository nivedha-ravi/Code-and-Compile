"""
input:
friday is today
output:
today is friday
"""
string=input().strip()
l=list(string.split(" "))
for i in range(len(l)-1,-1,-1):
    print(l[i],end=" ")
