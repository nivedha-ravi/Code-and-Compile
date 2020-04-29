"""
Given a set of numbers where all other numbers are multiple of the smallest number, 
the program must find the count of the common factors C excluding 1.
Input Format:First line will contain the integer value N representing how many numbers are passed as input.
Next N lines will have the numbers.Output Format:First line will contain the count of common factors C.
Constraints:N will be from 2 to 20.
Sample Input/Output:Example 1:Input:210075 Output:2Explanation:The common factors excluding 1 are 5,25.
Hence output is 2
Example 2:Input:3102030Output:3Explanation:The common factors excluding 1 are 2,5,10. Hence output is 3.
"""
n=int(input())
l=[]
for i in range(0,n):
    t=int(input())
    l.append(t)
count=0
a=min(l)
for i in range(2,a+1):
    c=0
    for j in range(0,n):
        if l[j]%i==0:
            c+=1
        else:
            continue
    if(c==n):
        count+=1
print(count)
