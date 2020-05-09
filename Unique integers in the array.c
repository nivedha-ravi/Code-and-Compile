/*
The program must accept an integer array of size N as the input.
The program must print the unique integers in the array as the output.
If there is no unique integer in the array, then the program must print -1 as the output.
Boundary Condition(s):
3 <= N <= 100 -100 <= Each Integer <= 999
Example Input/Output 1:
Input:
3
88 76 56
Output:
88 76 56
Example Input/Output 2:
Input:
4
88 77 88 77
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,count=0;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{   int flag=0;
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j] && a[i]!=1000 && a[j]!=1000)
        {
            flag=1;
            a[j]=1000;
            count=1;
        }
    }
    if(flag==0)
    {
        if(a[i]!=1000)
        {
        printf("%d ",a[i]);
        count=0;
        }
    }
}
if(count==1)
{
    printf("-1");
}

}
