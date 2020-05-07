/*
Accept a string S and print the count of instances N where the characters are repeating successively.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the integer value N
Example Input/Output 1:
Input:
aabcbbbcd
Output:
2
Explanation:
aa bbb are the two occurrences where the same character repeats successively.
Example Input/Output 2:
Input:
hjjikpkpkkkkqqqeww
Output:
 4
 */
#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    char s1[100];
    int count=0,n=0;
    for(int i=0;i<strlen(s)-1;i++)
    {
        if(s[i]==s[i+1])
        {
            n++;
        }
        else
        {
            n=0;
        }
        if(n==1)
        {
            count++;
        }
    }
    printf("%d",count);


}
