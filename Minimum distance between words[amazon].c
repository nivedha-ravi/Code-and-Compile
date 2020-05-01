/*
 Minimum Distance Between Words [AMAZON]
A string S is passed as the input. Two words W1 and W2 which are present in the string S are also passed as the input.
 The program must find the minimum distance D between W1 and W2 in S (in forward or reverse order) and print D as the output.
Input Format:
The first line will contain S.
The second line will contain W1.
The third line will contain W2.
Output Format:
The first line will contain D - the minimum distance between W1 and W2 in S.
Boundary Conditions:
Length of S is from 5 to 200.
Example Input/Output 1:
Input:
the brown quick frog quick the
the
quick
Output:
1
Explanation:
quick and the are adjacent as the last two words.
 Hence distance between them is 1.
Example Input/Output 2:
Input:
the quick the brown quick brown the frog
quick
frog
Output:
3
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char sen[50][50],w1[20],w2[20];
int i=0,index1[50],index2[50],l=0,m=0,min=100;
while(scanf("%s",sen[i])>0)
{
    i++;
}
strcpy(w1,sen[i-2]);
strcpy(w2,sen[i-1]);
i=i-2;
for(int j=0;j<i;j++)
{
    if(strcmp(w1,sen[j])==0)
    {
        index1[l++]=j;
    }
    else if(strcmp(w2,sen[j])==0)
    {
        index2[m++]=j;
    }
}
if(m==0)
{
    printf("%d",l-2);
}
else
{
    for(int j=0;j<l;j++)
    {
        for(int k=0;k<m;k++)
        {
            signed int diff;
             diff=index1[j]-index2[k];
            if(diff<0)
            {diff=0-diff;
            }
            if(diff<min)
            {
                min=diff;
            }
        }
    }
    printf("%d",min);
}
}
