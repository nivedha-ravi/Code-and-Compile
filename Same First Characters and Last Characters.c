/*
The program must accept N string values as the input.
If the first characters of N string values are equal and also the last characters of N string values are equal, then the program must print YES as the output.
Else the program must print NO as the output.
For alphabets the comparison must NOT be case sensitive.
Boundary Condition(s):
1 <= N <= 50 1 <= Length of each string <= 100
Example Input/Output 1:
Input:
3
Apple
Arrange
abstractable
Output:
YES
Example Input/Output 2:
Input:
2
mango
morning
Output:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,count=0;
char s[50][5000];
scanf("%d\n",&n);
int i=0;
while(i<n)
{
    scanf("%s\n",s[i]);
    char ch[101],first,last;
    strcpy(ch,s[i]);
    int ni=strlen(ch);
    if(i==0)
    {
        if(isalpha(ch[0]) && isalpha(ch[ni-1]))
        {
            first=toupper(ch[0]);
            last=toupper(ch[ni-1]);
        }
        else
        {
            first=ch[0];
            last=ch[ni-1];
        }
    }
    else
    {
    if(isalpha(ch[0]) && isalpha(ch[ni-1]))
    {
        ch[0]=toupper(ch[0]);
        ch[ni-1]=toupper(ch[ni-1]);
    }
     if((first!=ch[0] && last!=ch[ni-1])||(first==ch[0] && last!=ch[ni-1])||(first!=ch[0] && last==ch[ni-1])||(first==ch[ni-1]&& last==ch[0]))
        {
            printf("NO");
            return 0;
        }
    }

    i++;
}
printf("YES");
return 0;

}
