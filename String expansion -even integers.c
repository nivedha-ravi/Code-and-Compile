/*
Input: u5h4a10k7
Output: u5hhhhaaaaaaaaaak7
Explanation: In the string u5h4a10k7, the even integers are 4 and 10.
After repeating the previous alphabet of 4 by 4 times in the string u5h4a10k7, the string becomes u5hhhha10k7.
After repeating the previous alphabet of 10 by 10 times in the string u5hhhha10k7, the string becomes u5hhhhaaaaaaaaaak7.
Hence the output is u5hhhhaaaaaaaaaak7
Example Input/Output 2:
Input: A2B4C6
Output: AABBBBCCCCCC
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    char c,s[100];
    int n,l=0,a[100],k=0;
    while(scanf("%c%d",&c,&n)>0){
        s[k++]=c;
        a[l++]=n;
    }
    for(int i=0;i<l;i++){
        if(i==l-1){
            break;
        }
        if(a[i]%2==0){
            for(int j=0;j<a[i];j++){
                printf("%c",s[i]);
            }
        }else{
            printf("%c%d",s[i],a[i]);
        }
    }
}
