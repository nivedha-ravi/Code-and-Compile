/*
Input:
3
There is nothing permanent except change
Output:
There is nothing change except permanent
Explanation: The last 3 words "permanent except change" are reversed and the remaining words are printed as it is
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,i=0;
scanf("%d\n",&n);
char s[100][1001];
while(scanf("%s",&s[i])==1)
{
    i++;
}
for(int j=0;j<i-n;j++)
{
    printf("%s ",s[j]);
}
i=i-1;
while(n--)
{
    printf("%s ",s[i--]);
}
}
