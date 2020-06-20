/*
Input:
4 5
5 8 1 5 3
3 6 9 8 2
1 9 4 2 1
3 9 7 3 6
Output:
5 8 1 5 3
3 * * * 2
1 * * * 1
3 9 7 3 6
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,a;
    scanf("%d %d",&r,&c);
    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            scanf("%d ",&a);
            if(i==1||j==1||i==r||j==c)
            {

                printf("%d ",a);
            }
            else
            {
                printf("* ");
            }
        }
        printf("\n");
    }


}
