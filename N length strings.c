/*
The program must accept a string S and an integer N as the input.
The program must print N equal parts of the string S if the string S can be divided into N equal parts.
Else the program must print -1 as the output.
Boundary Condition(s):
2 <= Length of S <= 1000 2 <= N <= Length of S
Example Input/Output 1:
Input:
whiteblackgreen 3
Output:
white black green
Explanation:
Divide the string whiteblackgreen into 3 equal parts as white black green Hence the output is white black green
Example Input/Output 2:
Input:
pencilrubber 5
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
int n;
scanf("%s %d",s,&n);
int len=strlen(s);
int ctr=len/n;
if(len%n==0)
{   for(int i=0;i<len;i++)
    {
        if(i%ctr==0)
        {
            printf(" %c",s[i]);
        }
        else
        {
        printf("%c",s[i]);
        }

    }
}
else
{
    printf("-1");
}

}
