/*
An integer matrix M of size R*C is given as input. A string S is also passed as the input. The program must replace the occurrences of 0 (zero) in the matrix M with the characters in string S in their of order of occurrence and print the resulting matrix as the output. Boundary Condition(s): 2 <= R, C <= 100 Input Format: The first line contains the value of R and C separated by space(s). The next R lines contain the C integer values each representing the matrix M. The next line contains the string S. Output Format:
The first line contains C integers separated by a space.
Example Input/Output 1:
Input:
4 5
27 3 0 3 9
11 7 10 13 29
5 31 0 12 17
27 16 20 0 8
machine
Output:
27 3 m 3 9
11 7 10 13 29
5 31 a 12 17
27 16 20 c 8
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c;
scanf("%d %d\n",&r,&c);
int a[r][c],k=0;
char s[1000];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
    }
    scanf("\n");
}
scanf("%s",s);
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(a[i][j]==0)
        {
            printf("%c ",s[k++]);
        }
        else
        {
            printf("%d ",a[i][j]);
        }
    }
    printf("\n");
}

}
