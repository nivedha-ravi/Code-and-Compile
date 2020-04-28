//*Input:
10
40 18 5 89 9 74 69 59 27 93
Output:
3 10
//*

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int num,sval,lval,pos,pos1;
    scanf("%d\n",&num);
    int arr[1000],i;
    for(i=0;i<num;i++)
    {
        scanf("%d ",&arr[i]);
    }
    lval = arr[0];
    for( i=0;i<num;i++)
    {
        if(lval<arr[i])
        {
            lval = arr[i];
            pos = i;
        }
    }
    sval = arr[0];
    for(i=0;i<num;i++)
    {
        if(sval>arr[i])
        {
            sval = arr[i];
            pos1 = i;
        }
    }
printf("%d %d",pos1+1,pos+1);
return 0;
}
