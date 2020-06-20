/*
Input:
4 5
1 1 2 5 3
9 3 4 9 8
2 8 8 5 6
6 8 2 4 2
Output:
* * * * *
* 3 4 9 *
* 8 8 5 * 
* * * * *
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,a;
    scanf("%d %d",&r,&c);
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a);
            if(i==0||j==0||i==r-1||j==c-1)
            {
              printf("* ");
            }
            else
            {
                printf("%d ",a);
            }
        }
        printf("\n");
    }


}
