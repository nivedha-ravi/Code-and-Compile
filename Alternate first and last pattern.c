/*
INPUT:
environment
OUTPUT:
nvironmen
evironmet
enironmnt
envronent
envioment
envirnment
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
int i,j,st=0,e;
scanf("%s",s);
e=strlen(s)-1;
for(i=0;i<(strlen(s)+1)/2;i++)
{
    for(j=0;j<strlen(s);j++)
    {
        if(j!=st&&j!=e)
        {
            printf("%c",s[j]);
        }
    }
    printf("\n");
    st++;
    e--;
}

}
