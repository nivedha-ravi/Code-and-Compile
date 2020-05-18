#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1001];
    scanf("%[^\n]",s);
    int i=0;
    s[0]=toupper(s[0]);
    while(s[i]!='\0')
    {
        if(s[i]==' ')
        {
            s[i+1]=toupper(s[i+1]);
        }
        i++;
    }
    printf("%s",s);


}
