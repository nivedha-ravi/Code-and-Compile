/*
The program must accept a character matrix of size NxN as the input. For each column in the matrix, the program must bring all the consonants at the top of the column in the same order as in the input. Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains the value of N.
The next N lines each contain N characters separated by a space.
Output Format:
The first N lines each contain N characters of the modified matrix separated by a space.
Example Input/Output 1:
Input:
4
U I c N
a x S b
g a O L
R m L M
Output:
g x c N
R m S b
U I L L
a a O M
*/
/*
The program must accept a character matrix of size NxN as the input. For each column in the matrix, the program must bring all the consonants at the top of the column in the same order as in the input. Finally, the program must print the modified matrix as the output.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains the value of N.
The next N lines each contain N characters separated by a space.
Output Format:
The first N lines each contain N characters of the modified matrix separated by a space.
Example Input/Output 1:
Input:
4
U I c N
a x S b
g a O L
R m L M
Output:
g x c N
R m S b
U I L L
a a O M
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
char c[n][n],d[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%c ",&c[i][j]);
    }
}
int k=0,l=0;
for(int j=0;j<n;j++)
{
    for(int i=0;i<n;i++)
    {
        if(!(c[i][j]=='a'||c[i][j]=='e'||c[i][j]=='i'||c[i][j]=='o'||c[i][j]=='u'||c[i][j]=='A'||c[i][j]=='E'||c[i][j]=='I'||c[i][j]=='O'||c[i][j]=='U'))
        {
            d[k++][l]=c[i][j];
        }
    }
    for(int i=0;i<n;i++)
    {
        if(c[i][j]=='a'||c[i][j]=='e'||c[i][j]=='i'||c[i][j]=='o'||c[i][j]=='u'||c[i][j]=='A'||c[i][j]=='E'||c[i][j]=='I'||c[i][j]=='O'||c[i][j]=='U')
        {
            d[k++][l]=c[i][j];
        }
    }
    l++;
    k=0;
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        printf("%c ",d[i][j]);
    }
    printf("\n");
}


}
