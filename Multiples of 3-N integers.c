/*
Input:
4
14 18 22 15
Output:
12 9 6 3
18 15 12 9 6 3
21 18 15 12 9 6 3
15 12 9 6 3
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,val;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        scanf("%d ",&val);
        val=val-val%3;
        while(val>=3)
        {
            printf("%d ",val);
            val-=3;
        }
        printf("\n");
    }



}
