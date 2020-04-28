"""
Input:
10
40 18 5 89 9 74 69 59 27 93
Output:
3 10
"""
n=int(input())
l=list(map(int,input().strip().split()))[:n]
maximum=int(max)
minimum=int(min)
print(l.index(minimum)+1,l.index(maximum)+1,end=" ")
