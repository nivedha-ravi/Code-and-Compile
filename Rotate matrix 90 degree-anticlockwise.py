"""
input:
2
3
4 5 9
1 3 5
ouput:
9 5
5 3
4 1
"""
a=int(input())
b,b1=int(input()),[]
for i in range(a):
    b1.append(list(map(int,input().strip().split()))[::-1])
for i in range(b):
    for j in range(a):
        print(b1[j][i],end=" ")
    print()
