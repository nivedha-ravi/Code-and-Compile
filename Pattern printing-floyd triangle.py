"""
input:
5
ouput:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
"""
n=int(input())
a=1
for i in range(1,n+1):
    for j in range(1,i+1):
        print(a,end=" ")
        a+=1
    print()
