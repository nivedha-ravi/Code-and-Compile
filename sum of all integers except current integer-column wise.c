/*
Input:
3
9 5 1
3 7 3
3 6 9
Output:
6 13 12
12 11 10
12 12 4
Explanation:
For the integer 9, the sum of 3 and 3 is 6.
For the integer 5, the sum of 7 and 6 is 13.
For the integer 1, the sum of 3 and 9 is 12.
For the integer 3, the sum of 9 and 3 is 12.
For the integer 7, the sum of 5 and 6 is 11.
For the integer 3, the sum of 1 and 9 is 10.
For the integer 3, the sum of 9 and 3 is 12.
For the integer 6, the sum of 5 and 7 is 12.
For the integer 9, the sum of 1 and 3 is 4.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int a[n][n],colsum[n];
    for(int j=0;j<n;j++)
    {
        colsum[j]=0;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d ",&a[i][j]);
            colsum[j]=colsum[j]+a[i][j];
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",colsum[j]-a[i][j]);
        }
        printf("\n");
    }

}
