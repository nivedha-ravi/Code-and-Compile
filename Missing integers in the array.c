/*
The program must accept an integer array of size N as the input.
The program must find the minimum and the maximum integers in the array as X and Y.
Then the program must print all the integers from X to Y which are not present in the given array.
If all the integers are present in the array then the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 100 1 <= Array Element Value <= 1000
Example Input/Output 1:
Input:
5 6 4 2 7 4
Output:
3 5
Explanation:
The minimum integer from the array is 2.
The maximum integer from the array is 7.
The integers between 2 to 7 are 3 4 5 and 6. Here 4 and 6 are present in the array.
The integers 3 and 5 are not present in the array. Hence the output is 3 5
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]>a[j])
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
           for(int k=j;k<n;k++)
           {
               a[k]=a[k+1];
           }
           n--;
        }
    }
}
int min=a[0],max=a[n-1],count=1;
for(int i=min+1;i<max;i++)
{  int flag=0;
    for(int j=0;j<n;j++)
    {
        if(i==a[j])
        {
            flag=1;
        }
    }
    if(flag==0)
    {
    printf("%d ",i);
    count=0;
    }
}
if(count==1)
{
    printf("-1");
}

}
