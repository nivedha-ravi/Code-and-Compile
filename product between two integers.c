/*
The program must accept N integers as the input.
The program print the product of the integers which are present between two negative integers as the output.
Note:
Atleast two negative integers will be present.
Boundary Condition(s):
1 <= N <= 10^5
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the product of the integers which are present between two negative integers.
Example Input/Output 1:
Input:
9
10 -12 3 4 2 -24 5 3 -15
Output:
24 15
Explanation:
The first two negative elements are -12 and -24.
The elements between -12 and -24 are 3, 4 and 2 and their product is 24. So 24 is printed.
Then the next two negative elements are -24 and -15. The elements between -24 and -15 are 5 and 3 and their product is 15. So 15 is printed.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,neg=-1;
long long int zer=0;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
long long int prod=1;
for(int i=0;i<n;i++)
{
    if(a[i]<0 && neg!=-1)
    {
        if(prod==1 && a[i-1]!=1)
        {
            printf("%lld ",zer);
        }
        else if(prod==1 && a[i-1]==1)
        {
            printf("%lld ",prod);
        }
        else
        {
        printf("%lld ",prod);
        }
        prod=1;
        neg=i;
        continue;
    }
    if(a[i]<0 && neg==-1)
    {
        neg=i;
        continue;
    }
    if(neg!=-1)
    {
    prod=prod*a[i];
    }

}

}
