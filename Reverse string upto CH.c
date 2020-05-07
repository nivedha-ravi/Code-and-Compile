/*
A string S and a character CH are passed as the input to the program.
The program must reverse the string up to character CH and print the modified string as the output.
If there are more than one CH in S then the program must reverse up to the last occurring CH in S.
Note:
If the character CH is not present in S then the program must print the string without any modifications.
Boundary Condition(s):
1 <= Length of string S <= 1000
Example Input/Output 1:
Input:
Indonesia s
Output:
senodnIia
Example Input/Output 2:
Input:
skillset l
Output:
lliksset
Explanation:
The character l has occurred twice in the string. So the last occurrence is considered and the string skill is reversed as lliks.
So the output is lliksset
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000],ch;
scanf("%s %c",s,&ch);
int i,k=0,g=0,l=strlen(s);
for(i=0;i<l;i++)
{
    if(s[i]==ch)
    {
        g=1;
        k=i;
    }
}
if(g==1)
{
    for(i=k;i>=0;i--)
    {
        printf("%c",s[i]);
    }
    for(i=k+1;i<l;i++)
    {
        printf("%c",s[i]);
    }
}
else
{
    printf("%s",s);
}
}
