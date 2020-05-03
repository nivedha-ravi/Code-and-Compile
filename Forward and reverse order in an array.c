/*
INPUT:
5
24 56 73 88 97
OUTPUT:
24 56 88 97 73
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
    if(a[i]%2==0)
    {
        printf("%d ",a[i]);
    }
}
for(int j=n-1;j>=0;j--)
{
    if(a[j]%2!=0)
    {
        printf("%d ",a[j]);
    }
}
}
