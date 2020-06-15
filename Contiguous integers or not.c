/*
INPUT:
8
5 2 3 6 4 4 6 6
OUTPUT:
YES
*/
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
    for(int i=0;i<n-1;i++)
    {
        if(a[i+1]-a[i]!=0 &&a[i+1]-a[i]!=1)
        {
            printf("NO");
            return 0;
        }
    }
    printf("YES");

}
