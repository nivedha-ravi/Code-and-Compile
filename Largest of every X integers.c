/*
The program must accept N integers as the input.
The program must also accept another integer X (where N is divisible by X) as the input.
The program must consider the largest among every X integers.
These largest values must be sorted and printed in descending order as the output.
Boundary Condition(s):
1 <= N <= 10^5
1 <= X <= N
-10^5 <= Each Integer Value <= 10^5
Input Format:
The first line contains the two integers N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains N/X integers separated by space(s).
Example Input/Output 1:
Input:
9
3 10 30 20 99 77 101 9 5 2
Output:
101 30 9
Explanation:
X = 3, The first three integers are 10, 30 and 20. Here the largest integer is 30.
The next three integers are 99, 77 and 101. Here the largest integer is 101.
The next three integers are 9, 5 and 2. Here the largest integer is 9.
The largest integers of every three integers are 30, 101 and 9. So these largest integers are sorted in descending order. Hence the output is 101 30 9
Example Input/Output 2:
Input:
8
4 -70 30 -75 68 -16 79 -93 61
Output:
79 68
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d %d\n",&n,&x);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
int maximum[n/x],k=0,max=-100000;
for(int i=0;i<n;i++)
{   if(a[i]>=max)
    {
        max=a[i];
    }
    if((i+1)%x==0)
    {
        maximum[k++]=max;
        max=-100000;
    }
}
for(int i=0;i<k;i++)
{
    for(int j=i+1;j<k;j++)
    {
        if(maximum[i]>maximum[j])
        {
            int temp=maximum[i];
            maximum[i]=maximum[j];
            maximum[j]=temp;
        }
    }
}
for(int i=k-1;i>=0;i--)
{
    printf("%d ",maximum[i]);
}

}
