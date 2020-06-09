#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d ",&a[i]);
    }
    printf("%d ",a[1]);
    for(int i=1;i<=n-2;i++)
    {
        printf("%d ",a[i-1]+a[i+1]);
    }
    printf("%d ",a[n-2]);


}
