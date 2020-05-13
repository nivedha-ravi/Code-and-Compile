/*
An integer matrix of size R*C is given as input.
The program must print the row having the most number of odd numbers in it.
If more than one rows have the most number of odd numbers, print the first occurring row.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains the value of R and C separated by space(s).
The next R lines contain C elements each separated by space(s).
Output Format:
The first line contains C integers separated by a space.
Example Input/Output 1:
Input:
3 4
15 76 34 99
77 70 9 73
84 73 72 78
Output:
77 70 9 73
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c,maxodd=0,oddrow;
scanf("%d %d\n",&r,&c);
int a[r][c];
for(int i=0;i<r;i++)
{   int count=0;
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
        if(a[i][j]%2!=0)
        {
            count++;
        }
    }
    if(count>maxodd)
    {
        maxodd=count;
        oddrow=i;
    }
    scanf("\n");
}

    for(int j=0;j<c;j++)
    {
        printf("%d ",a[oddrow][j]);
    }


}
