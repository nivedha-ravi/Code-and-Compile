/*
The program must accept two character matrices are of the same size RxC as the input. For each alphabet at the same position in both the matrices, the program must print greater alphabet as the output.
Note:
Alphabets in both the matrix matrices are only in lower-case.
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains the values of R and C separated by a space. The next Rx2 lines each contain C alphabets separated by a space.
Output Format:
The first R lines each contain C alphabets separated by a space.
Example Input/Output 1:
Input:
2 3
a f h
n u d
m o g
k t s
Output:
m o h
n u s
Example Input/Output 2:
Input:
4 4
k n q g
o p s d
e r y g
m s d e
p w f d
p m q f
k j h p
r c t s
Output:
p w q g
p p s f
k r y p
r s t s
*/
#include <stdio.h>
#include <stdlib.h>
int main()
{
  int R, C;
  scanf("%d %d", &R, &C);
  char matrix1[R][C], ch;
  for(int row = 0; row < R; row++)
  {
    for(int col = 0; col < C; col++)
    {
      scanf(" %c", &matrix1[row][col]);
    }
  }
  for(int row = 0; row < R; row++)
  {
    for(int col = 0; col < C; col++)
    {
      scanf(" %c", &ch);
      printf("%c ", (ch > matrix1[row][col]) ? ch : matrix1[row][col]);
    }
    printf("\n");
  }
  return 0;
}
