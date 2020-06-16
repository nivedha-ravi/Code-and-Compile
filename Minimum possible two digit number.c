/*
INPUT:
54
OUTPUT:
45
INPUT:
67
OUTPUT:
67
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    if(n%10>n/10 || n%10==0)
    {
        printf("%d",n);
    }
    else
    {
        printf("%d%d",n%10,n/10);
    }



}
