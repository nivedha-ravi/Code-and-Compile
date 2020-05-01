/*
The program must accept the registration number N of a car as the input.The program must print the sum of digits in N as the output.
INPUT:
TN-76 AC-1234
OUTPUT:
23
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[14];
fgets(s,14,stdin);
int sum=0;
for(int i=0;i<strlen(s);i++)
{
    if(isdigit(s[i]))
    {
        int d=s[i]-'0';
        sum+=d;
    }
}
printf("%d",sum);
}
