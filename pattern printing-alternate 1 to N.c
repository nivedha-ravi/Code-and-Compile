/*
INPUT:
5
OUTPUT:
11111
55555
22222
44444
33333
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int increaseval=1,decreaseval=n;
for(int i=1;i<=n;i++)
{
    int printval=(i%2!=0)?(increaseval++):(decreaseval--);
    for(int j=1;j<=n;j++)
    {
        printf("%d",printval);
    }
    printf("\n");
}

}
