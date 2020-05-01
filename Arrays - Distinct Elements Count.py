"""
Two integer arrays of length L1 and L2 are passed as input. The program must print the sum of the distinct elements present in both the arrays.
That is the program must print the count of integer values that are present in the first array but not in the second array plus the count of integer values that are present in the second array but not in the first array.

Input Format:
The first line will contain L1 and L2 separated by a space.
The second line will contain the L1 integer values separated by a space.
The third line will contain the L2 integer values separated by a space.

Output Format:
First line will contain the integer value which is the count of the distinct elements in both the arrays.

Boundary Conditions:
1 <= L1 <= 50
1 <= L2 <= 50

Example Input/Output 1:
Input:
4 5
1 5 9 10
22 5 12 9 5

Output:
4

Explanation:
The distinct elements present in first array are 1, 10 and in the second array are 22, 12.

Example Input/Output 2:
Input:
3 2
100 200 300
201 600

Output:
5
"""
m,n=input().split(" ")
m,n=int(m),int(n)
a=list(map(int,input().strip().split()))[:m]
b=list(map(int,input().strip().split()))[:n]
count,k=0,0
for i in range(0,len(a)):
    for j in range(i+1,len(a)):
        if a[i]==a[j]:
            a[j]=""
            k+=1
for i in range(0,len(b)):
    for j in range(i+1,len(b)):
        if b[i]==b[j]:
            b[j]=""
            k+=1
for i in range(0,m):
    for j in range(0,n):
        if a[i]==b[j]:
            count+=1
print(m+n-(count*2)-k)
