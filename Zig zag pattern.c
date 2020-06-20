/*
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
7 8 9
6 5 4
1 2 3
Explanation:
The matrix is printed in a zig zag manner starting from the bottom of the matrix.
The rows are printed left to right and right to left direction alternatively.
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
        }
    }
    int revflag=0;
    for(int row=r-1;row>=0;row--)
    {
        int diff=revflag?-1:1;
        int col=revflag?c-1:0;
        for(int j=1;j<=c;j++)
        {
            printf("%d ",a[row][col]);
            col+=diff;
        }
        revflag=!revflag;
        printf("\n");
    }


}
