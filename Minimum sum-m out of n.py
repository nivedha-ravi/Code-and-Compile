"""
input:
5 2
9 2 1 5 4

ouput:
3
explantion:
out of all elements the sum of 1+2=3 is minimum
so 3 is printed as output
"""
m,n=input().split(" ")
m,n=int(m),int(n)
l=list(map(int,input().strip().split()))[:m]
l.sort()
sum=0
for i in range(n):
    sum=sum+l[i]
print(sum)
