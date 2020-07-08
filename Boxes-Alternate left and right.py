"""
INPUT:
5
5 3 6 1 7
3
OUTPUT:
3 4 6 3 6
INPUT:
8
17 5 9 12 8 20 14 21
6
OUTPUT:
14 11 6 12 8 20 14 21
"""
N = int(input())

arr = list(map(int,input().split()))

k = int(input())

for i in range(N):

    if arr[i]%2 and arr[i]>=k:

        arr[i]-=k

        arr[i-1]+=k//2+k%2

        arr[(i+1)%N]+=k//2

print(*arr)
