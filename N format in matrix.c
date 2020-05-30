/*
Input:
4
r t u o
k l a d
j h d g
v b m z
Output:
rkjvldzgdo
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,k=0;
scanf("%d\n",&n);
char a[n][n],s[n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%c ",&a[i][j]);
        if(j==0)
        {
            printf("%c",a[i][j]);
        }
    }
}
for(int i=1;i<=n-1;i++)
{
    printf("%c",a[i][i]);
}
for(int i=n-2;i>=0;i--)
{
    printf("%c",a[i][n-1]);
}

}
