/*
Ram likes palindromic words.
He reads a word and wants to find the longest palindromic substring in the given word.
The word is given as the input to the program.
Help Ram by printing the length of the longest palindromic substring in the given word as the output.
Boundary Condition(s):
1 <= Length of the word <= 1000
Input Format:
The first line contains the word.
Output Format:
The first line contains the length of the longest palindromic substring.
Example Input/Output 1:
Input:
management
Output:
3
Explanation:
There are two palindromic substring values with length 3 in management.
Example Input/Output 2:
Input:
triangle
Output:
1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char s[1000];
scanf("%s",s);
int n=strlen(s),res=0,max=1;
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(s[i]==s[j])
        {
            int c=0;
            for(int k=i,l=j;k<=j && l>=i;k++,l--)
            {
                if(s[k]==s[l])
                {
                    c++;
                }
            }
            if(c==(j-i)+1)
            {
                res=c;
            }
        }
    }
    if(res>max)
    {
        max=res;
    }
}
printf("%d",max);
}
