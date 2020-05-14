/*
Example Input/Output 1:
Input:
change
Output:
chaegn
Example Input/Output 2:
Input:
bcdfgh
Output:
bcdfgh
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
scanf("%[^\n]",s);
int n=strlen(s);
int k,flag=0;
for(int i=0;i<n;i++)
{
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
    {
        printf("%c",s[i]);
        k=i;
        if(k!=n-1)
        {
        flag=1;
        break;
        }
    }
    else
    {
    printf("%c",s[i]);
    }
}
if(flag==1)
{
for(int j=n-1;j>k;j--)
{
    printf("%c",s[j]);
}
}


}
