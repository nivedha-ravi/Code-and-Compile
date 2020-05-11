/*
A string S is given as the input to the program.
The program must swap every two characters in the odd positions of the string and print the modified string as the output.
Boundary Condition(s):
1 <= Length of string <= 1000
Example Input/Output:
Input:
shuttle
Output:
uhstelt
Explanation:
The characters at the odd positions 1 and 3 are s and u which are swapped.
The string becomes uhsttle.
The characters at the next two odd positions 5 and 7 are t and e which are swapped. The string becomes uhstelt.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
scanf("%s",s);
int n=strlen(s);
if(n<=2)
{
    printf("%s",s);
}
else
{
for(int i=0,j=i+2;;)
{
    if(i>=n || j>=n)
    {
        break;
    }
    else
    {
    char temp=s[i];
    s[i]=s[j];
    s[j]=temp;
    }
    i=j+2;
    j=i+2;
}
printf("%s",s);
}

}
