"""
INPUT:
1 2 3 4 5
OUTPUT:
120 60 40 30 24
"""
string=list(map(int,input().strip().split()))
for i in range(len(string)):
    mul=1
    for j in range(len(string)):
        if(i!=j):
            mul=mul*string[j]
    print(mul,end=" ")
