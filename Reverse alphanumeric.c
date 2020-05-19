/*
Input: **hi** !23 skillrack Output: **kc** !ar lliks32ih
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[101];
scanf("%[^\n]",s);
int i=0,j=strlen(s)-1;
while(i<j)
{
    if(isalnum(s[i])&& isalnum(s[j]))
    {
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
    }
    if(!(isalnum(s[i])))
    {
        i++;
    }
    if(!(isalnum(s[j])))
    {
        j--;
    }
}
printf("%s",s);
}
