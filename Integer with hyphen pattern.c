/*
Input:
5
Output:
1----1
12---21
123--321
1234-4321
1234554321
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        printf("%d",j);
    }
    for(int h=1;h<=n-i;h++)
    {
        printf("-");
    }
    for(int j=i;j>=1;j--)
    {
        printf("%d",j);
    }
    printf("\n");
}

}
