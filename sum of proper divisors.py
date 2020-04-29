/* Given a natural number N , the program must print the sum of all its proper divisors.
Definition: A proper divisor of a natural number is the divisor that is strictly less than the number.
Boundary Conditions:
1 < N <= 100000
Input Format:
First line will contain the integer value of N.
Output Format:
First line will contain the sum of all the proper divisors of N.
Sample Input/Output:
Example 1:
Input:
2
Output:
1
Explanation:
1 is the only proper divisor of 2. Hence sum is also 1.
Example 2:
Input:
20
Output:
22
Explanation:
The proper divisors of 20 are 1,2,4,5,10. Hence their sum is 22
*/
n=int(input())
sum=0
for i in range(1,n):
    if(n%i==0):
        sum=sum+i
print(sum)
