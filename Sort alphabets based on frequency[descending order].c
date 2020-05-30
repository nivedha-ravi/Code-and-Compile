/*
INPUT:
aaajjbbbcccc
OUTPUT:
ccccaaabbbjj
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a[1001];
    scanf("%s",a);
    int l=strlen(a);
    int t[26]={0};
    int m=-1;
    for(int i=0;i<l;i++){
    t[a[i]-'a']++;
    if(t[a[i]-'a']>m)
    m=t[a[i]-'a'];
    }
   // printf("%d*",m);
    while(m>0){
        for(int i=0;i<26;i++){
            if(t[i]==m){
                while(t[i]--)
            printf("%c",i+'a');
            }
        }
        m--;
    }

}
