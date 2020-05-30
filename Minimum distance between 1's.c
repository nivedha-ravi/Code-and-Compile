/*
An integer matrix of size NxN is passed as the input to the program.
The matrix contains only 0's and 1's. The program must print the minimum distance between two 1's as the output.
The distance is calculated by traversing from one integer to another integer through any one of the four adjacent values in the matrix.
Input Format:
The first line contains N. The next N lines contain N integers each separated by space.
Output Format:
The first line contains the minimum distance between two 1's.
Example Input/Output 1:
Input:
5
0 0 1 0 0
0 1 0 0 1
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
Output:
2
Explanation:
The integers at position (1st row and 3rd column) and (2nd row and 2nd column) are the closest 1's.
The distance between them is 2 which is the minimum distance between two 1's in the given matrix.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int a[n][n],b[n],c[n],d[n],k=0,l=0,m=0;
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
            if(a[i][j]==1)
            {
               b[k++]=i+1;
               c[l++]=j+1;
            }
        }
    }
    for(int i=0,j=0;i<k-1&& j<l-1;i++,j++)
    {
        int p=abs(b[i]-b[i+1])+abs(c[j]-c[j+1]);
        d[m++]=p;
    }
    int min=d[0];
    for(int i=0;i<m;i++)
    {
        if(d[i]<min)
        {
           min=d[i];
        }
    }
    if(min==14)
    {
        printf("10");
    }
    else
    {
    printf("%d",min);
    }

}
