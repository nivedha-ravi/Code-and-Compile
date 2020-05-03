/*
The program must accept N integers as the input.
The program must print the integers in the following order smallest integer, largest integer, second smallest integer, second largest integer and so on.
Boundary Condition(s):
2 <= N <= 100
Example Input/Output 1:
Input:
6 10 12 8 9 11 5
Output:
5 12 8 11 9 10
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n],i,j;
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(i=0;i<n;i++)
{
    for(j=i+1;j<n;j++)
    {
        if(a[i]>a[j])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
for(i=0,j=n-1;i<j;i++,j--)
{
    printf("%d %d ",a[i],a[j]);
}
if(i==j)
{
    printf("%d ",a[i]);
}

}
