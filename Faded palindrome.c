/*
The program must accept a string S as the input.
The string S contains one . (dot) in it.
If the string S forms a palindrome by replacing . (dot) by any character or by removing the . (dot) then the program must print the palindromic string as the output.
Else the program must print -1 as the output.
Note:
If a palindromic string can be formed by both removing and replacing the . (dot) then the priority is given for removing the . (dot).
Boundary condition(s):
3 <= Length of S <= 100
Input Format:
The first line contains the string S.
Output Format:
The first line contains either a palindromic string or -1.
Example Input/Output 1:
Input:
a.ba
Output:
aba
Example Input/Output 2:
Input:
kajh.ak
Output:
kajhjak
Example Input/Output 3:
Input:
a.c
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[100];
scanf("%s",s);
int n=strlen(s),length=n-1,i=0,flag=0
;
while(i<length)
{
    if(s[i]!='.'&& s[n-i-1]!='.' && s[i]!=s[length])
    {
        flag=1;
    }
    i++;
    length--;
}
if(flag==0)
{
    for(int i=0;i<n;i++)
    {
    if(s[i]!='.')
    {
        printf("%c",s[i]);
    }
    if(s[i]=='.' && n%2!=0 && i==(n/2))
    {
        continue;
    }
    else if(s[i]=='.' && n%2!=0 && i!=(n/2))
    {
        printf("%c",s[n-i-1]);
    }
    else if(s[i]=='.' && i!=(n/2)+1 && i!=(n/2)-1)
    {
        printf("%c",s[n-i-1]);
    }
    }
}
else
{
    printf("-1");
}
}
