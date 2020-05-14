/*
The program must accept an integer matrix of size NxN as the input.
The program must print the elements in the column which has the maximum number of prime numbers.
If more than one column has the same number of prime numbers then consider the first occurred column as the output.
If there is no prime number in the matrix then the program must print -1 as the output.
Boundary Condition(s):
2 <= N <= 50
Input Format:
The first line contains the value of N. The next N lines each contain N integers separated by space(s).
Output Format:
The first N lines each contain an integer or the first line contains -1.
Example Input/Output 1:
Input:
3
12 17 44
91 96 76
11 71 14
Output:
17
96
71
Explanation:
The first column contains only one prime number (11).
The second column contains two prime numbers (17, 71).
The third column does not contain any prime number.
Here the second column has more prime numbers than the other columns. So the elements in the second column are printed as the output.
Example Input/Output 2:
Input:
4
68 8 22 4
85 21 54 55
24 88 91 39
44 60 34 50
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>
int isPrime(int a)
{
    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
            return 0;
        }
    }
    return 1;
}

int main()
{
int n,maxprime=0,maxprimecol;
scanf("%d\n",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
    }
    scanf("\n");
}
for(int j=0;j<n;j++)
{
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(isPrime(a[i][j])==1)
        {
            count++;
        }
    }
    if(count>maxprime)
    {
        maxprime=count;
        maxprimecol=j;
    }
}
if(maxprime==0)
{
    printf("-1");
}
else
{
for(int i=0;i<n;i++)
{
    printf("%d\n",a[i][maxprimecol]);
}
}


}
