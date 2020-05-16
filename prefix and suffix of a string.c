/*
The program must print a string S consisting of lowercase letters.
The program must print YES if it is possible to reorder the characters in this string to get a string with prefix "srack" and suffix "kcars". Else the program must print NO as the output.
Boundary Condition(s): 11 <= Length of String S <= 100
Example Input/Output 1:
Input:
sracklearnkcars
Output:
YES
Example Input/Output 2:
Input:
srackkcars
Output:
NO
Example Input/output 3:
Input:
krcsarraecksad
Output:
YES
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    int alphacount[128]={0};
    for(int i=0;i<strlen(s);i++)
    {
        alphacount[s[i]]++;
    }
    int flag=0;
    if(strlen(s)==10)
    {
        printf("NO");
    }
    else
    {
        for(int i=0;i<strlen(s);i++)
        {
            if(s[i]=='s'||s[i]=='r'||s[i]=='a'||s[i]=='c'||s[i]=='k')
            {
                if(alphacount[s[i]]>=2)
                {
                    flag=1;
                }
                else
                {
                    printf("NO");
                    return 0;
                }
            }
        }
        printf("YES");
        return 0;
    }



}
