/*
INPUT:
9944
OUTPUT:
z
INPUT:
30
OUTPUT:
1245675
OUTPUT:
d
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,sum=0;
    scanf("%d",&n);
    while(n>0)
    {
        sum+=n%10;
        n/=10;
    }
    printf("%c",(sum>26)?((sum%26)+96):sum+96);
}
