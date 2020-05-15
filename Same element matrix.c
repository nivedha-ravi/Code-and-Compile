/*
The program must accept two integer matrices of same size RxC as the input. For each integer at the same position in both the matrices are equal then the program must print T else print F as the output.
Example Input/Output 1:
Input:
5 4
10 1 10 3
9 3 6 8
7 4 2 3
2 6 10 7
7 3 4 6
10 8 7 3
10 3 10 6
8 1 2 4
4 1 7 6
9 9 2 6
Output:
T F F T
F T F F
F F T F
F F F F
F F F T
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c;
scanf("%d %d\n",&r,&c);
int a[r][c],b[r][c];
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
        scanf("%d ",&b[i][j]);
    }
}
for(int i=0,k=0;i<r && k<r;i++,k++)
{
    for(int j=0,l=0;j<c&&l<c;j++,l++)
    {
        if(a[i][j]==b[k][l])
        {
            printf("T ");
        }
        else
        {
            printf("F ");
        }
    }
    printf("\n");
}

}
