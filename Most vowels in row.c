/*
Input:
5
G w w t e
H d E o P
Z D H e W
X I H e A
H o O D e
Output: H o O D e
*/
#include<stdio.h>
#include <stdlib.h>
int isVowel(char c)
{
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    {
        return 1;
    }
    return 0;
}

int main()
{
    int n;
    scanf("%d\n",&n);
    char a[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%c ",&a[i][j]);
        }
    }
    int maxvowelcount=0,maxvowelrow=0;
    for(int i=0;i<n;i++)
    {
        int vowel=0;
        for(int j=0;j<n;j++)
        {
            if(tolower(isVowel(a[i][j])==1))
            {
                vowel++;
            }
        }
        if(vowel>=maxvowelcount)
        {
            maxvowelcount=vowel;
            maxvowelrow=i;
        }
    }
    for(int j=0;j<n;j++)
    {
        printf("%c ",a[maxvowelrow][j]);
    }


}
 #include <stdio.h>
 #include <string.h>
 int main()
 {
 int N;
 scanf("%d", &N);
 char matrix[N][N], str[2];
 int maxVowCount = 0, maxVowRow = 0;
 for(int row=0; row<N; row++)
 {
 int currRowVowCount = 0;
 for(int col=0; col<N; col++)
 {
 scanf("%s", str);
 matrix[row][col] = str[0];
 switch(tolower(matrix[row][col]))
 {
 case 'a':
 case 'e':
 case 'i':
 case 'o':
 case 'u':
 currRowVowCount++;
 } }
  if(currRowVowCount >= maxVowCount)
  {
  maxVowCount = currRowVowCount;
  maxVowRow = row;
  } }
  for(int col=0; col<N; col++)
  { printf("%c ", matrix[maxVowRow][col]);
  } return 0;
  }
