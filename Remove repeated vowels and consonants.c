/*
A string S is passed as the input to the program.
The program must remove a consonant in S if it is followed by a consonant and also the program must remove a vowel in S if it is followed by a vowel.
Boundary Condition(s):
1 <= Length of string S <= 1000
Example Input/Output 1:
Input:
cheNnAi
Output:
heni
Example Input/Output 2:
Input:
continuous
Output:
cotinus
Explanation:
The letter c is a consonant and is followed by the vowel o so it is not removed.
The letter o is a vowel and is followed by the consonant n so it is not removed.
The letter n is a consonant and is followed by the consonant t so it is removed.
The string becomes cotinuous.
The letter t is a consonant and is followed by the vowel i so it is not removed.
The letter i is a vowel and is followed by the consonant n so it is not removed.
The letter n is a consonant and is followed by the vowel u so it is not removed.
The letter u is a vowel and is followed by the vowel o so it is removed.
The string becomes cotinous.
The letter o is a vowel and is followed by the vowel u so it is removed.
The string becomes cotinus. The letter u is a vowel and is followed by the consonant s so it is not removed.
So the output is cotinus.
*/
#include<stdio.h>
#include <stdlib.h>
int isVowel(char ch)
{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
        return 1;
    }
    else
    {
    return 0;
    }
}

int main()
{
char s[1000];
scanf("%s",s);
for(int i=0;i<strlen(s)-1;i++)
{
    if(isVowel(s[i])==1 && isVowel(s[i+1])==1)
    {
        s[i]='+';
    }
    else if(isVowel(s[i])==0 && isVowel(s[i+1])==0)
    {
        s[i]='+';
    }
}
for(int i=0;i<strlen(s);i++)
{
    if(s[i]!='+')
    {
        printf("%c",s[i]);
    }

}


}
