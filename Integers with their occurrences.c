/*
The program must accept N integers as the input.
The program must print the integers in descending order with their occurrence count separated by '-' in each line as the output.
INPUT:
5 1 9 2 1 1
Output:
 9-1
 2-1
 1-3
 */
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,occurrences[101]={0};
scanf("%d\n",&n);
int a[n],i=0;
for(i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
    occurrences[a[i]]++;
}
for(int i=100;i>=0;i--)
{   if(occurrences[i]!=0)
{
    printf("%d-%d\n",i,occurrences[i]);
}
}

}
