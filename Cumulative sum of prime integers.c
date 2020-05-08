/*
Input:
5
Output:
2 5 10 17 28
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,val=2,printed=0,sum=0;
scanf("%d",&n);
while(printed<n)
{
    int flag=0;
    double sqrtval=sqrt(val);
    for(int i=2;i<=sqrtval;i++)
    {
        if(val%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        sum+=val;
        printf("%d ",sum);
        printed++;
    }
    val++;
}

}
