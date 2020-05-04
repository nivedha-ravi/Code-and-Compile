/*
The program must accept N integers as the input.
The program must group the same elements together in the given order and print it as the output.
Boundary Condition(s):
1 <= N <= 10^5 1 <= Each Integer Value <= 1000
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains N integers separated by space(s).
Example Input/Output 1:
Input:
7 3 4 1 4 3 1 4
Output:
3 3 4 4 4 1 1
Explanation:
The 1st element 3 occurs for 2 times. So 3 is printed 2 times (3 3).
The 2nd element 4 occurs as 3 times. So 4 is printed 3 times (4 4 4 ).
The 3rd element 1 occurs as 2 times. So 1 is printed 2 times (1 1).
Hence the output is 3 3 4 4 4 1 1
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
{   if(a[i]!=-1)
    {
    printf("%d ",a[i]);
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
            printf("%d ",a[j]);
            a[j]=-1;
        }
    }
    }
}


}
