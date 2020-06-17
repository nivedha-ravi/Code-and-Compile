/*
INPUT:
5 3
9 5 7 8 1
OUTPUT:
Yes
INPUT:
12 4
3 1 12 9 11 7 10 8 2 5 6 4
OUTPUT:
No
INPUT:
4 2
98 65 21 10
OUTPUT:
Yes
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,m,s[101],t,k,i,j;
scanf("%d%d",&n,&m);
for(i=0;i<n;i++)
scanf("%d",&s[i]);
for(i=0;i<=n-m;i++)
{
    t=0,k=0;
    for(j=i+1;j<i+m;j++)
    {
        if(s[j]<s[j-1])
        k++;
        else
        t++;
    }
    if(k==m-1||t==m-1)
    {
        printf("Yes");
        return 0;
    }
}
printf("No");
}
