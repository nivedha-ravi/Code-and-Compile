/*
The program must accept a positive integer array of size N as the input.
The program must print the element only if it's adjacent elements are even.
Else the program must print -1 as the output.
Note:
The first and the last element has only one adjacent element.
The program must print the element only if it's adjacent element is even. Else the program must print -1.
Boundary Condition(s):
3 <= N <= 100 1 <= Each element <= 999
Example Input/Output 1:
Input:
5 3 4 5 6 7
Output:
3 -1 5 -1 7
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{
    if(i==0 && a[i+1]%2==0)
    {
        printf("%d ",a[i]);
    }
    else if(i==n-1 && a[i-1]%2==0)
    {
        printf("%d ",a[i]);
    }
    else if(a[i-1]%2==0 && a[i+1]%2==0 && a[i]%2!=0)
    {
        printf("%d ",a[i]);
    }
    else if(a[i-1]%2==0 && a[i+1]%2==0 && a[i]%2==0)
    {
        printf("%d ",a[i]);
    }
    else
    {
        printf("-1 ");
    }
}



}
