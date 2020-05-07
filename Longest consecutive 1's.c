/*
INPUT:
1011011101100011
OUTPUT:
3
INPUT:
00101010100
OUTPUT:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
scanf("%s",s);
int maxcount=0;
for(int i=0;i<strlen(s);i++)
{   int count=0;
    if(s[i]=='1')
    {
        count++;
    }
    for(int j=i+1;j<strlen(s);j++)
    {
        if(s[j]=='1')
        {
            count++;
        }
        else
        {
            break;
        }
    }
    if(maxcount<count)
    {
       maxcount=count;
    }
}
if(maxcount<=1)
{
    printf("-1");
}
else
{
printf("%d",maxcount);
}

}
