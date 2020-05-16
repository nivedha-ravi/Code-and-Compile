/*
Input:
4
8 3 10 1
Output:
a b c d e f g h
a b c
a b c d e f g h i j
a
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{
    char c='a';
    for(int j=0;j<a[i];j++)
    {
        printf("%c ",c);
        c++;
    }
    printf("\n");
}
}
