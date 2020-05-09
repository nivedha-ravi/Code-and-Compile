/*
The program must accept an integer array of size N as the input.
The program must print the integers that are occurring odd number of times in the array as the output.
If there is no integer occurring odd number of times, then the program must print -1 as the output.
Boundary Condition(s):
3 <= N <= 100 1 <= Each integer < 100
Example Input/Output 1:
Input:
5
2 3 3 4 5
Output:
2 4 5
Example Input/Output 2:
Input:
4
21 11 21 11
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int a[n],oddoccur[101]={0},flag=0;
    for(int i=0;i<n;i++)
    {
        scanf("%d ",&a[i]);
        oddoccur[a[i]]++;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                a[j]=-1;
            }

        }
    }
    for(int i=0;i<n;i++)
    {   if(a[i]!=-1)
    {
        if(oddoccur[a[i]]%2==1)
        {
            printf("%d ",a[i]);
            flag=1;
        }
    }
    }
    if(flag==0)
    {
        printf("-1");
    }


}
