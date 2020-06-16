/*
INPUT:
12 89 10 21
OUTPUT:
YES
INPUT:
75 91 37 82
OUTPUT:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,n1,n2,n3;
    scanf("%d %d %d %d",&n,&n1,&n2,&n3);
    if(n%2==n2%2 && n1%2==n3%2 && n%2!=n1%2)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
}
