/*
INPUT:
57
OUTPUT:
yes
INPUT:
63
OUTPUT:
no
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int sum=0,prod=1,temp=n;
while(n>0)
{
    sum+=n%10;
    prod*=n%10;
    n/=10;
}
if(temp==sum+prod)
{
    printf("yes");
}
else
{
    printf("no");
}
}
