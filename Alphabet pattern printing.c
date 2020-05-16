/*
Input:
4 
Output:
a
B c
D e F
g H i J
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,ctr=0;
scanf("%d",&n);
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        if(ctr%2==0)
        {
            printf("%c ",ctr%26+'a');
        }
        else
        {
            printf("%c ",ctr%26+'A');
        }
        ctr++;
    }
    printf("\n");
}
}
