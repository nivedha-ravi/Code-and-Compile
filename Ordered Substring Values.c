/*
The program must accept a string S and integer N as the input.
The program must print all the substring values of size N in S which are in alphabetical order as the output.
If no substring of size N in S is in alphabetical order then the program must print -1.
Note:
The substring values must be printed in the order of their occurrences.
Boundary Condition(s):
1 <= Length of string S <= 1000
Example Input/Output 1:
Input:
bracket 2
Output:
br ac ck et
Explanation:
There are 4 substring values of size 2 in alphabetical order. so the output is br ac ck et
Example Input/Output 2:
Input:
boomerang 3
Output:
boo
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1001];
int n,count=0,flag=0;
scanf("%s %d",s,&n);
int l=strlen(s);
for(int i=0;i<l;i++)
{
    if(i!=0)
    {
    if(s[i-1]<=s[i])
    {
        count++;
    }
    else if(s[i-1]>s[i])
    {
        count=0;
    }
    if(count>=n-1)
    {
        int g=count;
        if(count==n-1)
        {
        for(int j=i-count;j<=i;j++)
        {
            printf("%c",s[j]);
        }
        printf(" ");
        flag=1;
        }
        if(g>=n)
        {
            int c=g-n+1;
            for(int j=i-g+c;j<=i;j++)
            {
                printf("%c",s[j]);
            }
            printf(" ");
            flag=1;
        }
    }
    }
}
if(flag==0)
{
    printf("-1");
}

}
