/*
INPUT:
(A+B*(c+d)*(e-f))
OUTPUT:
1 2 2 3 3 1
INPUT:
()()(()()((())))
OUTPUT:
1 1 2 2 3 4 4 5 5 6 7 8 8 7 6 3
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[101];
scanf("%s",s);
int i=0,first,temp=1;
int l=strlen(s);
int a[l],top=-1;
while(s[i]!='\0')
{
    if(s[i]=='(')
    {
        top++;
        a[top]=temp;
        printf("%d ",temp);
        temp++;
    }
    if(s[i]==')')
    {
        printf("%d ",a[top]);
        top--;
    }
    i++;
}

}
#include<stdio.h>
#include <stdlib.h>

int main()
{
int i,j,k=0,m=0,l=1,a[101];
char s[101];
scanf(" %s ",s);
k=strlen(s);
for(i=0;i<k;i++)
{
    if(s[i]=='(')
    {
        a[m++]=l;
        printf("%d ",l++);
    }
    else if(s[i]==')')
    {
        printf("%d ",a[--m]);
    }
}

}
