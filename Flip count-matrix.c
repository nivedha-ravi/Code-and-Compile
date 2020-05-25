/*
The program must accept a matrix of size NxN as the input. The matrix contains only 0's and 1's.
The program must transpose the matrix then the program must print the flip count required to make the transpose matrix and the original matrix is equal.
Boundary condition(s):
1 <= N <= 50
Input Format:
The first line contains the integer value of N. The next N lines contain N integers separated by space(s).
Output Format:
The first line contains the flip count required to make the original matrix and the transposed matrix equal.
Example Input/Output 1:
Input:
3
0 0 1
1 1 1
1 0 0
Output:
4
Explanation:
Orginal matrix 0 0 1 1 1 1 1 0 0 Transpose matrix 0 1 1 0 1 0 1 1 0 The number of flips required is 4. Hence the output is 4
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int a[n][n];
    int flipcount=0;
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
            if(a[i][j]!=a[j][i])
            {
                flipcount++;
            }
        }
    }
    printf("%d",flipcount);



}
