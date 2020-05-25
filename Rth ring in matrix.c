/*
The program must accept an integer matrix of size NxN and integer R as the input.
The program must print only the elements present in the Rth ring as the output as shown in Example Input/Output section.
Boundary Condition(s):
1 <= N <= 100
1 <= R <= (N+1)/2
Input Format:
The first line contains the value of N. The next N lines contain N integers separated by space(s).
The (N+2)th line contains the value of R.
Output Format:
The first N lines contain the elements present in the Rth ring as the output as shown in Example Input/Output section.
Example Input/Output 1:
Input:
5
6 9 4 1 4
8 1 2 6 7
6 6 2 6 6
8 3 2 4 4
6 2 8 9 3
2
Output:
- - - - -
- 1 2 6 -
- 6 - 6 -
- 3 2 4 -
- - - - -
Example Input/Output 2:
Input:
4
8 8 1 9
1 8 3 6
7 1 9 5
2 9 8 4
1
Output:
8 8 1 9
1 - - 6
7 - - 5
2 9 8 4
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,r;
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
    scanf("%d",&r);
    for(int row=0;row<n;row++)
    {
        for(int col=0;col<n;col++)
        {
            if((row==r-1 && col>=r-1 && col<=n-r)||(col==r-1 && row>=r-1 && row<=n-r)||(row==n-r && col>=r-1 && col<=n-r)||(col==n-r && row>=r-1 && row<=n-r))
            {
                printf("%d ",a[row][col]);
            }
            else
            {
                printf("- ");
            }
        }
        printf("\n");

    }

}
