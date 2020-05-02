"""
input:
5
output:
15 10 6 3 1
14 9 5 2
13 8 4
12 7
11
"""
n=int(input())
first=int((n*(n+1))/2)
for i in range(0,n):
    val=n
    temp=first
    print(temp,end=" ")
    for j in range(0,n-i-1):
        print(temp-val,end=" ")
        temp=temp-val
        val-=1
    first-=1
    print()
