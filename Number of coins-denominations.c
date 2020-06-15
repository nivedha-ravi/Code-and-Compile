/*
INPUT:
1593
OUTPUT:
8
EXPLANATION:
1593=(1000*1)+(500*1)+(50*1)+(20*2)+(1*3)
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    long long int a;
    scanf("%lld",&a);
    int c=0;
    c+=a/1000;
    a=a%1000;
    c+=a/500;
    a=a%500;
    c+=a/100;
    a=a%100;
    c+=a/50;
    a=a%50;
    c+=a/20;
    a=a%20;
    c+=a/5;
    a=a%5;
    c+=a/1;
    printf("%d",c);

}
