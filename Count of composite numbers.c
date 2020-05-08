/*
INPUT:
9
OUTPUT:
4
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int c=0;
for(int i=2;i<=n;i++)
{
    for(int j=2;j<=sqrt(i);j++)
    {
        if(i%j==0)
        {
           c++;
           break;
        }
    }
}
printf("%d",c);
}
