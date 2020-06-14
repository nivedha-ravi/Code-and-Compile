/*
INPUT:
23 3
OUTPUT:
7
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d %d",&n,&x);
printf("%d",n&((1<<x)-1));
}
