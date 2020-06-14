#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
printf("%s",((n&(n-1))==0)?"yes":"no");
}
