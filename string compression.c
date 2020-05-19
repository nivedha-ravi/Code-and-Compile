/*
Input: aaabbbbcc Output: a3b4c2
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[101];
    scanf("%s",s);
    int count=0;
    for(int i=0;s[i]!='\0';i++)
    {
        count++;
        if(s[i]!=s[i+1])
        {
            printf("%c%d",s[i],count);
            count=0;
        }
    }

}
