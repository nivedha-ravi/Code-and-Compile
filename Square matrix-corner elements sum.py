"""
A square matrix of size N×N is passed as the input. The program must calculate and print the sum of the elements in the corners.
Input Format:
The first line will contain the value of N.
The next N lines will contain the N values separated by one or more spaces.
Output Format:
The first line will contain the integer value denoting the sum of the elements in the corners.
Boundary Conditions:
2 <= N <= 20
Example Input/Output 1:
Input:
3
10 90 1
4  22 5
32 8 66
Output:
109
Explanation:
The sum = 10+1+66+32 =  109
"""
n=int(input())
l,s=[],0
for i in range(n):
    l.append(list(map(int,input().split())))
for i in range(n):
    for j in range(n):
        if (i==0 and j==0)or(i==0 and j==n-1)or(i==n-1 and j==0)or(i==n-1 and j==n-1):
            s+=l[i][j]
print(s)
    
