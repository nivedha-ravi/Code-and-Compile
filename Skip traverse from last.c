/*
INPUT:
6
23 17 32 27 14 63
OUTPUT:
63 32 23
INPUT:
7
37 19 83 74 3 2 82
OUTPUT:
82 3 19
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
    for(int i=n-1;i>=0;)
    {
        if(a[i]%2==1)
        {
            printf("%d ",a[i]);
            i=i-3;
        }
        if(a[i]%2==0)
        {
            printf("%d ",a[i]);
            i=i-2;
        }
    }


}
