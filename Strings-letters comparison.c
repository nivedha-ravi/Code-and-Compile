#include<stdio.h>
#include <stdlib.h>

int main()
{
char s1[100],s2[100];
scanf("%s\n%s",s1,s2);
for(int i=0;i<strlen(s1);i++)
{
    for(int j=i+1;j<strlen(s1);j++)
    {
        if(s1[i]==s1[j])
        {
            s1[j]='\0';
        }
    }
}
for(int i=0;i<strlen(s2);i++)
{
    for(int j=i+1;j<strlen(s2);j++)
    {
        if(s2[i]==s2[j])
        {
            s2[j]='\0';
        }
    }
}
int count=0;
for(int i=0;i<strlen(s1);i++)
{
    for(int j=0;j<strlen(s2);j++)
    {
        if(s1[i]==s2[j])
        {
            count++;
        }
    }
}


if(count==strlen(s1)||count==strlen(s2))
{
    printf("YES");
}
else
{
    printf("NO");

}
}
