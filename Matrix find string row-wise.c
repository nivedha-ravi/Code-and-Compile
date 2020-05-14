/*
 A character matrix of size N*N and a string S are given as input.
 The program must check if the string is present in the matrix row-wise and print the row number of the rows with the given string in it.
 Boundary Condition(s):
 1 <= N <= 100
 Input Format:
 The first line contains the value N. The next N lines contain N characters each separated by space(s).
 The N+2th line contains the string S.
 Output Format:
 The row number values of rows with the given string are printed in each line.
 Example Input/Output 1:
 Input:
 4
 s k i l
 k t h e
 r t c k
 k t h e
 the
 Output:
 2
 4
 */
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
char a[n][n],s[n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%c ",&a[i][j]);
    }
    scanf("\n");
}
scanf("%s",s);
int l=strlen(s),k=0;
for(int i=0;i<n;i++)
{   int count=0;
    for(int j=0;j<n;j++)
    {
        if(a[i][j]==s[k])
        {
            count++;
            k++;
        }
    }
    if(count==l)
    {
        printf("%d\n",i+1);
    }
    k=0;
}
}
