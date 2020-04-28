//* INPUT:
Skillrack
OUTPUT:
Skallrick
*//


#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
char s[100],temp;
fgets(s,100,stdin);
for(int i=0;i<strlen(s);i++)
{
    for(int j=i+1;j<strlen(s);j++)
    {
        if((s[i]=='a'|| s[i]=='e'|| s[i]=='i'|| s[i]=='o'||s[i]=='u'|| s[i]=='A'||s[i]=='E'|| s[i]=='I'|| s[i]=='O'|| s[i]=='U') && (s[j]=='a'||s[j]=='e'|| s[j]=='i'||s[j]=='o'||s[j]=='u'||s[j]=='A'||s[j]=='E'||s[j]=='I'||s[j]=='O'||s[j]=='U'))
        {
            if(s[i]>s[j])
            {
                temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
    }
}
printf("%s",s);
}
