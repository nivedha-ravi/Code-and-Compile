/*
INPUT:
4 5
1 1 2 5 3
9 3 4 9 8
2 8 8 5 6
6 8 2 4 2
OUTPUT:
1 1 2 5 3 8 6 2 4 2 8 6 2 9 1
*/

#include <stdio.h>
#include <stdlib.h>
int main()
{
int R,C;
scanf("%d %d",&R,&C);
int matrix[R][C];
for(int row=0; row<R; row++)
{
for(int col=0; col<C; col++)
{
  scanf("%d",&matrix[row][col]);
}
}
for(int col=0; col<C; col++)
{
  printf("%d ",matrix[0][col]);
}
for(int row=1; row<R; row++)
{
  printf("%d ",matrix[row][C-1]);
}
for(int col=C-2; col>=0; col--)
{
  printf("%d ",matrix[R-1][col]);
}
for(int row=R-2; row>0; row--)
{
  printf("%d ",matrix[row][0]);
}
}
