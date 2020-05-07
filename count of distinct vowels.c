/*
The program must accept a string S as the input.
The program must print the count of distinct vowels in the string S as the output.
Note:
Alphabets are only is lowercase.
Boundary Condition(s):
1 <= Length of S <= 1000
Example Input/Output 1:
Input:
mediterranean
Output:
3
Explanation:
The distinct vowels in the string are 'e', 'i' and 'a'. Hence the output is 3
Example Input/Output 2:
Input:
rhythm
Output:
0
*/
#include<stdio.h>
#include<stdlib.h>
int isVowel(char ch)
{
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
  return 1;
}
return 0;
}
int main()
{
  char s[1000];
  scanf("%s",s);
  int count=0;
  for(int i=0;i<strlen(s);i++)
  {
  if(isVowel(s[i])==1)
  {
    count++;
    flag=1;
    for(int j=i+1;j<strlen(s);j++)
    {
      if(s[i]==s[j])
      {
        s[j]='*';
      }
    }
  }
  }
  printf("%d",count);

}
