/*
Input:
6 5
a n e i b
u t r h c
k s f v p
k j m r o
i e o q o
l g q q x
Output:
a
u
k
k
i
l
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,max=0,vowelcol;
    scanf("%d %d\n",&r,&c);
    char ch[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%c ",&ch[i][j]);
        }
    }
    for(int j=0;j<c;j++)
    {   int count=0;
        for(int i=0;i<r;i++)
        {
            if(ch[i][j]=='a'||ch[i][j]=='e'||ch[i][j]=='i'||ch[i][j]=='o'||ch[i][j]=='u')
            {
                count++;
            }
        }
        if(count>max)
        {
            max=count;
            vowelcol=j;
        }
    }
    for(int i=0;i<r;i++)
    {
        printf("%c\n",ch[i][vowelcol]);
    }


}
