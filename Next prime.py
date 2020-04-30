"""
INPUT:
11
OUTPUT:
13
"""
n=int(input())
while True:
    n+=1
    for j in range(2,n):
        if n%j==0:
            break
    else:
        print(n)
        break
