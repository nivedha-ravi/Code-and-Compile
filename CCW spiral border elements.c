/*
Input:
4 3
20 26 31
15 57 23
41 12 31
45 12 61
Output:
20 15 41 45 12 61 31 23 31 26
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c;
    scanf("%d %d",&r,&c);
    int a[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a[i][j]);
            if(j==0)
            {
                printf("%d ",a[i][j]);
            }
        }
    }
    for(int j=1;j<c;j++)
    {
        printf("%d ",a[r-1][j]);
    }
    for(int i=r-2;i>=0;i--)
    {
        printf("%d ",a[i][c-1]);
    }
    for(int j=c-2;j>=1;j--)
    {
        printf("%d ",a[0][j]);
    }
}
