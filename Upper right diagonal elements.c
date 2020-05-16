/*
Input:
4
9 8 6 3
5 2 7 5
8 9 1 2
4 6 3 5
Output:
9 8 6 3
* 2 7 5
* * 1 2
* * * 5
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
    }
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        if(i>j)
        {
            printf("* ");
        }
        else
        {
            printf("%d ",a[i][j]);
        }
    }
    printf("\n");
}

}
