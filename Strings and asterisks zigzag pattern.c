/*
INPUT:
eat
4
OUTPUT:
***e
at**
*###
####
*/
#include <stdlib.h>

int main()
{
char a[10000];
int N,k=0;
scanf("%s\n%d",a,&N);
for(int i=0;i<N;i++)
{
    if(i%2==0){
        for(int j=0;j<N-1-i;j++){
            printf("*");
        }
        for(int j=0;j<i+1;j++){
            if(k<strlen(a))
            printf("%c",a[k++]);
            else
            printf("#");
        }
    }
    else
    {
        for(int j=0;j<i+1;j++){
            if(k<strlen(a)){
                printf("%c",a[k++]);
            }
            else{
                printf("#");
            }
        }
        for(int j=0;j<N-1-i;j++){
            printf("*");
        }
    }
    printf("\n");
}
}
