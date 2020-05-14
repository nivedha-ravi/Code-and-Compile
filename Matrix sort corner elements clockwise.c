/*
An integer matrix of size R*C is passed as input.
The program must sort the elements at the corner position of the matrix in clock-wise direction and print the matrix.
Boundary Condition(s):
1 <= R, C <= 1000
Input Format:
The first line contains the value of R and C separated by space(s). The next R lines contain C elements each separated by space(s).
Output Format:
The first R lines contain C elements each separated by a space with corner elements sorted in clock-wise direction.
Example Input/Output 1:
Input:
3 3
9 2 7
4 5 6
3 8 1
Output:
1 2 3
4 5 6
9 8 7
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
int temp[4],k=0,l=0;
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if((i==0 && j==0)||(i==0&&j==c-1)||(i==r-1&& j==0 )||(i==r-1&& j==c-1))
        {
            temp[k++]=a[i][j];
        }
    }
}
for(int i=0;i<k;i++)
{
    for(int j=i+1;j<k;j++)
    {
        if(temp[i]>temp[j])
        {
            int temp1=temp[i];
            temp[i]=temp[j];
            temp[j]=temp1;
        }
    }
}
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if((i==0&&j==0)||(i==0&&j==c-1))
        {
            printf("%d ",temp[l++]);
        }
        else if(i==r-1&& j==c-1)
        {
            printf("%d ",temp[2]);
        }
        else if(i==r-1 && j==0)
        {
            printf("%d ",temp[3]);
        }
        else
        {
            printf("%d ",a[i][j]);
        }
    }
    printf("\n");
}

}
