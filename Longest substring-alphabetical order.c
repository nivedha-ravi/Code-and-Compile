/*
The program must accept a string S as the input.
The program must print the longest substring where the alphabets are in alphabetical order as the output.
If more than one substring have the same length then consider the first occurring substring.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains the string S.
Output Format:
The first line contains the longest substring where the alphabets are in alphabetical order.
Example Input/Output 1:
Input:
acegjdbmprtzdsvx
Output:
bmprtz
Explanation:
The substrings in alphabetical are acegj d bmprtz dsvx The longest substring is bmprtz. Hence the output is bmprtz
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
scanf("%s",s);
int n=strlen(s);
int max=0,count=1,min,num;
for(int i=0;i<n;i++)
{
int k=i,j=k+1;
while(s[k]<=s[j])
{
    count++;
    k++;
    j++;
}
if(count>max)
{
    max=count;
    min=j;
    num=i;
    count=1;
}
else
{
    count=1;
}
i=j-1;
}
for(int i=num;i<min;i++)
{
    printf("%c",s[i]);
}

}
