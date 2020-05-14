/*
An integer matrix of size N*N is given as input.
The program must print the maximum column-wise sum of the matrix.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains the value N. The next N lines contain N elements each separated by space(s).
Output Format:
The first line contains the maximum column sum.
Example Input/Output 1:
Input:
3
1 2 3
4 5 6
7 8 9
Output:
18
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n][n],maxsum=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
    }
    scanf("\n");
}
for(int j=0;j<n;j++)
{
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+a[i][j];
    }
    if(sum>maxsum)
    {
        maxsum=sum;
    }
}
printf("%d",maxsum);

}
