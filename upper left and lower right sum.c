/*
The program must accept a matrix of size RxC as the input. For each integer in the matrix, the program must print the sum of the elements present at the upper left position and lower right position as the output in the matrix format. Note: If the upper left or lower right integer are not present, print only the available integer. If both the integers are not present then print 0
Input:
4 5
34 40 15 36 31
26 36 33 41 34
47 38 32 43 31
45 19 32 36 22
Output:
36 33 41 34 0
38 66 83 46 36
19 58 72 55 41
0 47 38 32 43
Input:
3 4
48 21 61 31
65 67 28 65
69 42 44 31
Output:
67 28 65 0
42 92 52 61
0 65 67 28
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,sum=0;
    scanf("%d %d",&r,&c);
    int a[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d ",&a[i][j]);
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            sum=0;
            if(i-1>=0 && j-1>=0)
            {
                sum+=a[i-1][j-1];
            }
            if(i+1<r && j+1<c)
            {
                sum+=a[i+1][j+1];
            }
            printf("%d ",sum);
        }
        printf("\n");
    }

}
