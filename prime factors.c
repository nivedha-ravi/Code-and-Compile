/*
INPUT:
100
OUTPUT:
2 5
Explanation:
The factors of 100 are 1,2,4,5,10,20,25,50,100.
The prime factors of 100 are 2 and 5.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a;
    scanf("%d",&a);
    for(int i=2;i<=a;i++){
        if(a%i==0){
            int f=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=0;
                    break;
                }
            }
            if(f){
                printf("%d ",i);
            }
        }
    }


}
