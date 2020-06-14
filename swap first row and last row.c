/*
Input:
4
17 28 47 40
24 43 40 43
50 38 44 33
44 22 46 41
Output:
44 22 46 41
24 43 40 43
50 38 44 33
17 28 47 40
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
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
        printf("%d ",(i==0||i==n-1)?a[n-1-i][j]:a[i][j]);
    }
    printf("\n");
}

}
