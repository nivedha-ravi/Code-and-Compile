/*
INPUT:
5 6
1 2 3 4 5 5
5 2 5 2 4 5
6 7 5 5 5 3
5 7 5 4 5 4
7 7 5 5 5 1
3
OUTPUT:
YES
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c;
    scanf("%d %d\n",&r,&c);
    int a[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a[i][j]);
        }
    }
    int k,ct=0;
    scanf("\n%d",&k);
    for(int i=0;i<=r-k;i++)
    {
        for(int j=0;j<=c-k;j++)
        {
            ct=0;
            for(int y=i;y<i+k;y++)
            {
                for(int z=j;z<j+k;z++)
                {
                    if(y==i||y==i+k-1||z==j||z==j+k-1)
                    {
                        if(a[y][z]!=a[i][j])
                        {
                            ct++;
                        }
                    }
                }
            }
            if(ct==0)
            {
                printf("YES");
                return 0;
            }
        }
    }
    printf("NO");


}
