/*
Input:
4
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
Output:
1 2 3 -1
2 3 -1 5
3 -1 5 6
-1 5 6 7
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,count[100]={0};
scanf("%d\n",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
        if(count[a[i][j]]==i)
        {
            count[a[i][j]]++;
        }
    }
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        if(count[a[i][j]]==n)
        {
            a[i][j]=-1;
        }
        printf("%d ",a[i][j]);
    }
    printf("\n");
}

}
