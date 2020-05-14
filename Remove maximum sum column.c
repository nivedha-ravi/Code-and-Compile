/*
The program must accept an integer matrix of size RxC as the input.
Then the program must remove the column which has the maximum sum.
If more than one column has the maximum sum, then remove the last occurring column which has the maximum sum.
Boundary Condition(s):
1 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space. The next R lines contain C integers each separated by a space.
Output Format:
The first R lines contain C-1 integer each separated by a space.
Example Input/Output 1:
Input:
3 4
53 14 75 74
26 23 18 51
11 67 91 59
Output:
53 14 75
26 23 18
11 67 91
Explanation:
The last two columns have the maximum sum 184. The output is printed after removing the last occurring column with maximum sum.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c,maxsum=0,maxcol;
scanf("%d %d\n",&r,&c);
int a[r][c];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
    }
    scanf("\n");
}
for(int j=0;j<c;j++)
{
    int sum=0;
    for(int i=0;i<r;i++)
    {
        sum+=a[i][j];
    }
    if(sum>=maxsum)
    {
        maxsum=sum;
        maxcol=j;
    }
}
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(j==maxcol)
        {
            continue;
        }
        else
        {
            printf("%d ",a[i][j]);
        }
    }
    printf("\n");
}
}
