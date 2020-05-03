/*The program must accept N positive integers as the input. The program must print two elements which are duplicated in the given array in descending order. Note: The array must contain atleast two repeating element

Input:
 7 2 4 5 5 4 4 2
Output:
 5 4
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n],repeat[n],k=0;
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{   int count=0;
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
            if(count==0)
            {
            repeat[k++]=a[i];
            count=1;
            }
            else
            {
            a[j]='\0';
            }
        }

    }
}
for(int i=0;i<k;i++)
{
    for(int j=i+1;j<k;j++)
    {
        if(repeat[i]<repeat[j])
        {
            int temp=repeat[i];
            repeat[i]=repeat[j];
            repeat[j]=temp;
        }
    }
}
printf("%d %d",repeat[0],repeat[1]);
}
