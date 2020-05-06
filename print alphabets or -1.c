/*
The program must accept a string S as the input.
The program must calculate the count of vowels in S as C (the count of vowels in S is always less than 27) and print the C alphabets in lower case in alphabetic order as the output.
If there is no vowel in S, then the program must print -1 as the output.
Boundary Condition(s):
1 <= Length of String S <= 100
0 <= C <= 26
Example Input/Output 1:
Input:
apple
Output:
ab
Example Input/Output 2:
Input:
ENVIRONMENT
Output:
abcd
Example Input/Output 3:
Input:
XYZ
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>
int isVowel(char ch)
{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
        return 1;
    }
    return 0;
}

int main()
{
char s[100];
scanf("%s",s);
int c=0;
char ch='a';
for(int i=0;i<strlen(s);i++)
{
    if(isVowel(s[i])==1)
    {
        c++;
    }
}
if(c>0 && c<=26)
{
    for(int i=0;i<c;i++)
    {
        printf("%c",ch++);
    }
}
else
{
    printf("-1");
}

}
