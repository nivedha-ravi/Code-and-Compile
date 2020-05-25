/*
The program must accept an integer matrix of size RxC as the input.
A diagonal-constant matrix is a matrix in which all the elements in each left diagonal are same.
The program must print YES if it is a diagonal-constant matrix. Else the program must print NO as the output.
Boundary Condition(s):
2 <= R, C <= 50
Input Format:
The first line contains the integer values of R and C separated by a space. The next R lines contain C integers separated by space(s).
Output Format:
The first line contains either YES or NO.
Example Input/Output 1:
Input:
3 4
1 2 3 4
5 1 2 3
9 5 1 2
Output:
YES
Explanation:
The left diagonals in the matrix are highlighted below
1 2 3 4
5 1 2 3
9 5 1 2
Example Input/Output 2:
Input:
4 3
11 25 65
13 11 25
65 13 11
25 56 13
Output:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c;
scanf("%d %d",&r,&c);
int a[r][c];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
        if(i>0 && j>0)
        {
            if(a[i][j]!=a[i-1][j-1])
            {
                printf("NO");
                return 0;
            }
        }
    }
}
printf("YES");

}
