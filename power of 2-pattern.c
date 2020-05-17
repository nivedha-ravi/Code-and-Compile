/*
INPUT:
7
OUTPUT:
1
2 3
4 5 6 7
INPUT:
20
OUTPUT:
1
2 3
4 5 6 7
8 9 10 11 12 13 14 15
16 17 18 19 20 * * * * * * * * * * *
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int t=1;
    for(int i=0;t<=n;i++){
        for(int j=0;j<pow(2,i);j++){
            if(t<=n)
            printf("%d ",t);
            else
            printf("* ");
            t++;
        }
        printf("\n");
    }

}
