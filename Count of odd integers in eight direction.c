/*
The program must accept an integer matrix of size NxN and an integer X as the input. The program must print the count of odd integers present in all the eight directions (if available) of X in the matrix as the output. If X has occurred more than once then consider the first occurrence of X. If X has not occurred in the matrix then the program must print -1 as the output.
Input:
6
56 56 44 10 42 64
81 54 83 16 50 57
48 93 12 66 78 32
75 84 54 65 85 97
77 32 95 12 65 66
25 13 96 67 98 43
12
Output:
7
Explanation:
X = 12 Here 12 has occurred for two times in the matrix.
So consider the first occurrence of 12 which is present at the 3rd row and the 3rd column.
The elements present in all the eight directions are
56 56 44 10 42 64
81 54 83 16 50 57
48 93 12 66 78 32
75 84 54 65 85 97
77 32 95 12 65 66
25 13 96 67 98 43
So the count of odd integers in all the eight directions of 12 is 7. Hence the output is 7
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d",&n);
int a[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
    }
}
scanf("%d",&x);
int xrow,xcol,flag=0,count=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
      if(x==a[i][j])
      {
          xrow=i;
          xcol=j;
          flag=1;
          break;
      }
    }
    if(flag==1)
    {
        break;
    }
}
if(flag==0)
{
    printf("-1");
    return 0;
}
//traverse top
for(int i=xrow-1;i>=0;i--)
{
    if(a[i][xcol]%2!=0)
    {
        count++;
    }
}
//traverse topright
for(int i=xrow-1,j=xcol+1;i>=0 && j<n;i--,j++)
{
    if(a[i][j]%2!=0)
    {
        count++;
    }
}
//traverse right
for(int j=xcol+1;j<n;j++)
{
    if(a[xrow][j]%2!=0)
    {
        count++;
    }
}
//traverse bottom right
for(int i=xrow+1,j=xcol+1;i<n&&j<n;i++,j++)
{
    if(a[i][j]%2!=0)
    {
        count++;
    }
}
//traverse bottom
for(int i=xrow+1;i<n;i++)
{
    if(a[i][xcol]%2!=0)
    {
        count++;
    }
}
//traverse bottom left
for(int i=xrow+1,j=xcol-1;i<n&&j>=0;i++,j--)
{
    if(a[i][j]%2!=0)
    {
        count++;
    }
}
//traverse left
for(int i=xcol-1;i>=0;i--)
{
    if(a[xrow][i]%2!=0)
    {
        count++;
    }
}
//traverse topleft
for(int i=xrow-1,j=xcol-1;i>=0 && j>=0;i--,j--)
{
    if(a[i][j]%2!=0)
    {
        count++;
    }
}
printf("%d",count);

}
