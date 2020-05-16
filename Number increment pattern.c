/*
Input:
4
Output:
4 6 8 10
13 16 19 22
24 26 28 30
33 36 39 42
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int ctr=n;
for(int i=1;i<=n;i++)
{
    int diff=(i%2!=0)?2:3;
    for(int j=1;j<=n;j++)
    {
        printf("%d ",ctr);
        ctr+=diff;
    }
    (i%2!=0)?ctr++:ctr--;

    printf("\n");
}

}
