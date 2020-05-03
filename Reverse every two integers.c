/*
The program must accept N integers as the input. The program must reverse all the elements between every two odd integers among N integers.
Then the program must print modified values as the output.
Input:
10 2 5 16 18 22 17 90 24 21 22
Output:
2 5 22 18 16 17 24 90 21 22
Explanation:
The elements between the first two odd elements (5 and 17) are 16, 18 and 22.
Reverse the elements between 5 and 17 (2 5 22 18 16 17 90 24 21 22).
The elements between the next two odd elements (17 and 21) are 90 and 24.
Reverse the elements between 17 and 24 (2 5 22 18 16 17 24 90 21 22).
Hence the output is 2 5 22 18 16 17 24 90 21 22
Example Input/Output 2:
Input:
5 6 -8 -5 2 -18
Output:
6 -8 -5 2 -18
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]%2!=0 && a[j]%2!=0)
        {
            for(int k=i+1,l=j-1;k<l;k++,l--)
            {
                int temp=a[k];
                a[k]=a[l];
                a[l]=temp;
            }
            i=j;
        }
    }
}
for(int i=0;i<n;i++)
{
    printf("%d ",a[i]);
}

}
