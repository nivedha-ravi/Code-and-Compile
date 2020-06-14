/*
The program must accept an integer matrix of size NxN as the input. The program must replace all the diagonal elements of the matrix based on the following conditions. -If the sum of the main diagonal elements is equal to the sum of opposite diagonal elements then all the diagonal elements must be replaced by 0. -If the sum of the main diagonal elements is not equal to the sum of opposite diagonal elements then all the diagonal elements must be replaced by 1. Finally, the program must print the modified matrix as the output.
Input:
4
1 5 9 4
3 5 2 8
7 4 1 9
3 5 4 6
Output:
0 5 9 0
3 0 0 8
7 0 0 9
0 5 4 0
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d ",&n);
    int a[n][n],maindiagonalsum=0,oppdiagonalsum=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d ",&a[i][j]);
            if(i==j)
            {
                maindiagonalsum+=a[i][j];
            }
            else if(j==n-i-1)
            {
                oppdiagonalsum+=a[i][j];
            }
        }
    }
    int replacementval=(maindiagonalsum!=oppdiagonalsum);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j||j==n-i-1)
            {
                printf("%d ",replacementval);
            }
            else
            {
                printf("%d ",a[i][j]);
            }
        }
        printf("\n");
    }


}
