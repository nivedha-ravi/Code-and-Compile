/*
The program must accept a string S as the input.
The program must print the length of the longest substring containing vowels only as the output.
Boundary Condition(s):
3 <= Length of String S <= 1000
Input Format:
The first line contains the value of string S.
Output Format:
The first line contains the length of the longest sub-string containing vowels.
Example Input/Output 1:
Input:
abcaac
Output:
2
Explanation:
The length of the substring containing the vowel 'a' is 1. But the length of the substring containing the vowels 'aa' is 2.
So the length of the longest substring is 2.
Example Input/Output 2:
Input:
eoolloooeklkee
Output:
4
*/
#include<stdio.h>
#include <stdlib.h>
int isVowel(char ch)
{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        return 1;
    }
    return 0;
}

int main()
{
char s[1000];
scanf("%s",s);
int maxcount=0;
for(int i=0;i<strlen(s);i++)
{
    int count=0;
    if(isVowel(s[i])==1)
    {
        count++;
    }
    for(int j=i+1;j<strlen(s);j++)
    {
        if(isVowel(s[j])==1)
        {
            count++;
        }
        else if(isVowel(s[j])==0)
        {
            break;
        }
    }
    if(count>maxcount)
    {
        maxcount=count;
    }
}
printf("%d",maxcount);
}
