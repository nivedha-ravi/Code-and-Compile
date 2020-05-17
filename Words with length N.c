/*
INPUT:
Have a nice day
3
OUTPUT:
day
*/
#include<stdio.h>
#include <string.h>

int main()
{
char s[1001];
int n,flag=0;
scanf("%[^\n]",s);
scanf("%d",&n);
int i=strlen(s),count=0;
for(int j=0;j<=i;j++)
{
    if(s[j]!=' ' && s[j]!='\0')
    {
        count++;
    }
    else if(s[j]==' ')
    {
        if(count==n)
        {
            for(int k=j-count;k<j;k++)
            {
                printf("%c",s[k]);
            }
            printf(" ");
            flag=1;
            count=0;
        }
        else
        {
            count=0;
        }
    }
    else if(s[j]=='\0')
    {
        if(count==n)
        {
            for(int k=j-count;k<j;k++)
            {
                printf("%c",s[k]);
            }
            flag=1;
        }
    }
}

if(flag==0)
{
    printf("-1");
}


}
