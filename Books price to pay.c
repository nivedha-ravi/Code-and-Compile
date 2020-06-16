/*
INPUT:
5 5
100
OUTPUT:
485.00
INPUT:
3 6
OUTPUT:
118.80
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int d,b,p;
    float sum=0.0;
    scanf("%d %d %d",&d,&b,&p);
    while(b>0)
    {
        if(d>=0)
        {
            float r=(d*p)/100.0;
            float a=p-r;
            sum+=a;
        }
        else
        {
            sum+=p;
        }
        d--;
        b--;
    }
    printf("%.2f",sum);
}
