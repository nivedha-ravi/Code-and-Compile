/*
The program must accept the upper left triangle elements of an integer matrix size of NxN as the input.
The program must fill the lower right triangle of the matrix with the inverted upper left triangle elements.
Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains the value of N.
The next N lines contain the upper left triangle elements separated by space(s).
Output Format:
The first N line contain N elements of the modified matrix separated by space(s).
Example Input/Output 1:
Input:
4
3 7 3 7
3 2 8
4 8
9
Output
3 7 3 7
3 2 8 3
4 8 2 7
9 4 3 3
Explanation:
The upper left triangle elements are
3 7 3 7
3 2 8
4 8
9
The inverted upper left trianlge (lower right triangle) elements are
* * * 7
* * 8 3
* 8 2 7
9 4 3 3
Now the elements in the matrix are
3 7 3 7
3 2 8 3
4 8 2 7
9 4 3 3
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
    for(int j=0;j<n-i;j++)
    {
        scanf("%d ",&a[i][j]);
        printf("%d ",a[i][j]);
    }
    for(int k=i-1;k>=0;k--)
    {
        printf("%d ",a[k][n-i-1]);
    }
    printf("\n");
}

}
