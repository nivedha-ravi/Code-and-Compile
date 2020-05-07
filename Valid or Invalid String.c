/*
The program must accept a space separated string S as the input.
The program must print the VALID as the output if S satisfies the below conditions,
- There must be no space before full stops and comma.
- There must be space after full stops and comma.
- The letter after full stop must be in upper case.
- The letter after comma must be in lower case.
Else the program must print INVALID as the output.
Boundary Condition(s):
1 <= Length of S <= 100
Example Input/Output 1:
Input:
Hi,hello. how are you?
Output:
INVALID
Example Input/Output 2:
Input:
I want to buy a pencil, a sharpener, an eraser and a notebook.
Output:
VALID
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[101];
scanf("%[^\n]",s);
int n=strlen(s);
int full=0,comma++;
for(int i=0;i<n;i++)
{
  if(s[i]=='.')
  {
  full++;
  }
  if(s[i]==',')
  {
  comma++;
  }
}
if(full==0 && comma==0)
{
  printf("INVALID");
  return 0;
}
for(int i=0;i<n;i++)
{   if(i==n-1 && (s[i]=='.'))
    {
        break;
    }
    if(i==n-1 && s[i]==',')
    {
        if(s[i-1]==' ')
        {
            printf("INVALID");
            return 0;
        }
    }
    if(i==0 && s[i]=='.')
    {
        if(s[i+1]!=' ')
        {
            printf("INVALID");
            return 0;
        }
        if(islower(s[i+2]))
        {
            printf("INVALID");
            return 0;
        }
    }
    if(i==0 && s[i]==',')
    {
        if(s[i+1]!=' ')
        {
            printf("INVALID");
            return 0;
        }
        if(isupper(s[i+2]))
        {
            printf("INVALID");
            return 0;
        }
    }
    if(s[i]=='.')
    {
        if(s[i-1]==' ')
        {
            printf("INVALID");
            return 0;
        }
        if(s[i+1]!=' ')
        {
            printf("INVALID");
            return 0;
        }
        if(islower(s[i+2]))
        {
            printf("INVALID");
            return 0;
        }
    }
    if(s[i]==',')
    {
        if(s[i-1]==' ')
        {
            printf("INVALID");
            return 0;
        }
        if(s[i+1]!=' ')
        {
            printf("INVALID");
            return 0;
        }
        if(isupper(s[i+2]))
        {
            printf("INVALID");
            return 0;
        }
    }

}
printf("VALID");
return 0;

}
