/*
An integer matrix of size N*N is given as input.
The program must print the column-wise mirror image of the matrix as shown in the Example Input/Output section.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains the value N. The next N lines contain N elements each separated by space(s).
Output Format:
The first N lines contain the mirror image of the given matrix.
Example Input/Output 1:
Input:
4
1 2 3 4
5 6 7 8
9 0 1 2
3 4 5 6
Output:
4 3 2 1
8 7 6 5
2 1 0 9
6 5 4 3
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
    scanf("\n");
}
for(int i=0;i<n;i++)
{
    for(int j=n-1;j>=0;j--)
    {
        printf("%d ",a[i][j]);
    }
    printf("\n");
}

}
