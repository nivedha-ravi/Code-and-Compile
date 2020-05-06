/*
The program must accept two string values S1 and S2.
The program must print the pattern as shown in the Example Input/Output sections.
Boundary Condition(s):
1 <= Length of S1, S2 <= 100
Example Input/Output 1:
Input:
bad water
Output:
bw
aa
dt
*e
*r
Example Input/Output 2:
Input:
gionee kkr
Output:
gk
ik
or
n*
e*
e*
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[100],s1[100];
scanf("%s %s",s,s1);
int n=strlen(s),n1=strlen(s1);
if(n1>n)
{
for(int i=0,j=0;j<n1;i++,j++)
{
    if(i>=n)
    {
      printf("*%c\n",s1[j]);
    }
    else
    {
    printf("%c%c\n",s[i],s1[j]);
    }
}
}
else if(n>n1)
{
    for(int i=0,j=0;i<n;i++,j++)
    {
        if(j>=n1)
        {
            printf("%c*\n",s[i]);
        }
        else
        {
        printf("%c%c\n",s[i],s1[j]);
        }
    }
}
else
{
    for(int i=0,j=0;i<n && j<n1;i++,j++)
    {
        printf("%c%c\n",s[i],s1[j]);
    }
}

}
