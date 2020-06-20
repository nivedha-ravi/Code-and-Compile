/*
Input:
4 3
x e a
i f l
h z b
z j e
Output:
a
i
e
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c;
    scanf("%d %d ",&r,&c);
    char a[r][c],str[2];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%s",str);
            a[i][j]=str[0];
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=c-1;j>=0;j--)
        {
            if(a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='i'||a[i][j]=='o'||a[i][j]=='u')
            {
                printf("%c\n",a[i][j]);
                break;
            }
        }
    }


}
