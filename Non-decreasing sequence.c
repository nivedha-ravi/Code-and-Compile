/*
Example Input/Output 1:
Input:
5 4 5 3 1 2
Output:
Valid
Example Input/Output 2:
Input:
4 8 7 3 1
Output:
Invalid
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,p=0;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n-1;i++)
    {
        if(a[i]>=a[i+1])
        {
            p++;
        }
    }
    if(p==n-1)
    {
        printf("Invalid");
    }
    else
    {
        printf("Valid");
    }

}
