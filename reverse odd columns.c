/*
The program must accept an RxC matrix as the input.
The program must reverse the odd columns in the matrix and print the modified matrix as the output.
Boundary Condition(s):
1 <= R, C <= 100
Input Format:
The first line contains R and C separated by a space.
The next R lines contain C integers each separated by a space.
Output Format:
The first R lines contain the modified matrix.
Example Input/Output 1:
Input:
3 4
27 22 46 24
47 32 24 36
17 13 33 10
Output:
17 22 33 24
47 32 24 36
27 13 46 10
Explanation:
The first and third columns are reversed.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c;
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
    if(j%2==0)
    {
        for(int i=0,k=r-1;i<k;i++,k--)
        {
            int temp=a[i][j];
            a[i][j]=a[k][j];
            a[k][j]=temp;
        }
    }
}
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        printf("%d ",a[i][j]);
    }
    printf("\n");
}


}
