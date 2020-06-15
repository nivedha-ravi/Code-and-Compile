/*
INPUT:
5 4
1 2 3 4 5
6 4 3 2 1
OUTPUT:
YES
INPUT:
7 3
79 97 43 54 78 25 68
68 78 54 43 97 16 11
OUTPUT:
YES
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,k,f=0;
    scanf("%d %d",&n,&k);
    int a[n],b[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        scanf("%d",&b[i]);
    }
    for(int i=0;i<n;i++)
    {
        for(int j=n-1;j>=0;j--)
        {
            int c=0;
            if(a[i]==b[j])
            {
                for(int k1=i;k1<k+i;k1++)
                {
                    if(a[k1]==b[j])
                    {
                        c++;
                        j--;
                    }
                }
                if(c==k)
                {
                    printf("YES");
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            break;
        }
    }
    if(f==0)
    printf("NO");


}
