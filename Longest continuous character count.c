/*
A string S and a character C are passed as input.
The program must print the longest continuous occurrence of the character C. (The character C will definitely be present in S at least once).
Boundary Condition(s):
2 <= Length of String S <= 1000
Input Format:
The first line contains the string S and C separated by a space.
Output Format:
The first line contains the longest continuous occurrence of the character C.
Example Input/Output 1:
Input:
aabbaaabb a
Output:
3
Example Input/Output 2:
Input:
hopperetee e
Output:
2
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000],ch;
scanf("%s %c",s,&ch);
int maxcount=0;
for(int i=0;i<strlen(s);i++)
{   int count=0;
    if(s[i]==ch)
    {
        count++;
    }
    for(int j=i+1;j<strlen(s);j++)
    {
        if(s[j]!=ch)
        {
            break;
        }
        else
        {
            count++;
        }
    }
    if(count>maxcount)
    {
        maxcount=count;
    }
}
printf("%d",maxcount);


}
