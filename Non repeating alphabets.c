/*
The program must accept a string S as the input.
The program must print only the alphabets which are not repeated in the string S as the output.
If all the alphabets are repeated then the program must print -1 as the output.
Note:
The alphabets are only in lower case.
Boundary Condition(s):
1 <= Length of S <= 100
Example Input/Output 1:
Input:
eagle
Output:
agl
Explanation:
The alphabet 'e' is repeated two times in the string. The alphabet 'a', 'g' and 'l' are not repeated in the string.
Hence agl is printed as the output.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[101];
    scanf("%s",s);
    int l=strlen(s),alphacount[128]={0},flag=0;
    for(int i=0;i<l;i++)
    {
        alphacount[s[i]]++;
    }
    for(int i=0;i<l;i++)
    {
        if(alphacount[s[i]]==1)
        {
            printf("%c",s[i]);
            flag=1;
        }
    }
    if(flag==0)
    {
        printf("-1");
    }
}
