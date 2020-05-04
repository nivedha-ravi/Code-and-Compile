/*
The program must accept N integers as the input.
A positive integer X is also passed as the input.
The program must print the first and the last X odd integers as the output.
The last X odd integers must be printed in the reverse order starting from the end.
Note:
Atleast X odd integers will be present among the N integers.
Boundary Condition(s):
1 <= N <= 10^6 1 <= X <= N 1 <= Each Integer Value <= 10^5
Input Format:
The first line contains the two integers N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains 2*X integers.
Example Input/Output 1:
Input:
10 3 24 56 100 -7881 9 -61 91 88 101 900
Output: -7881 9 -61 101 91 -61
Explanation:
The first 3 odd integers are -7881, 9 and -61 The last 3 odd integers in reverse order are 101, 91 and -61.
Hence the output is -7881 9 -61 101 91 -61.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d %d\n",&n,&x);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
int count=0;
for(int i=0;i<n;i++)
{
    if(a[i]%2!=0)
    {
        count++;
        if(count>x)
        {
            break;
        }
        printf("%d ",a[i]);
    }
}
int c=0;
for(int i=n-1;i>=0;i--)
{
    if(a[i]%2!=0)
    {
        c++;
        if(c>x)
        {
            break;
        }
        printf("%d ",a[i]);

    }
}

}
