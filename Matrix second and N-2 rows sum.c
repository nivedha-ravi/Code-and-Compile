/*
An integer matrix of size N*N is given as input.
The program must print the sum of elements in the second row and last but one row.
Boundary Condition(s):
4 <= N <= 100
Input Format:
The first line contains the value of N. The next N lines contain N elements each separated by space(s).
Output Format:
The first line contains the sum of second and second but last row elements.
Example Input/Output 1:
Input:
4
5 10 25 30
20 10 25 25
10 20 40 50
20 10 20 10
Output:
200
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n][n],sum=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
        if(i==1 || i==n-2)
        {
            sum+=a[i][j];
        }
    }
    scanf("\n");
}
printf("%d",sum);

}
