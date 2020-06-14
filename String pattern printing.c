/*
The program must accept a string S as the input.
The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s): 2 <= Length of S <= 100
Input Format: The first line contains S.
Output Format: The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
LEMON
Output:
LEMON
EMONL
MONLE
ONLEM
NLEMO
LEMON
Example Input/Output 2:
Input:
abacus
Output:
abacus
bacusa
acusab
cusaba
usabac
sabacu
abacus
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[101];
    int len;
    scanf("%s%n",s,&len);
    for(int i=0;i<len;i++)
    {
        for(int j=i;j<i+len;j++)
        {
            printf("%c",s[j%len]);
        }
        printf("\n");
    }
    printf("%s",s);


}
