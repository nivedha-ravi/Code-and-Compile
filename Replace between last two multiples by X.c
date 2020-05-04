/*
The program must accept N integers and an integer X as the input.
The program must find the last two multiples of X as A and B in the given order.
The program must replace all the integers present between A and B (exclusive) by X.
Finally, the program must print N integers as the output.
Note:
Atleast two integers among N integers are always multiple of X.
Boundary Condition(s):
1 <= N <= 10^5 1 <= X <= 1000
Input Format:
The first line contains the two integers N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains N integers separated by space(s).
Example Input/Output 1:
Input;
9 10 2 10 3 5 20 85 67 90 56
Output:
2 10 3 5 20 10 10 90 56
Explanation:
The last two mulitple of 10 are 20 and 90 (2 10 3 5 20 85 67 90 56).
All the elements present between 20 and 90 replaced by 10 (2 10 3 5 20 10 10 90 56).
Hence the output is 2 10 3 5 20 10 10 90 56
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
int k,l;
for(int i=n-1;i>=0;i--)
{
    if(a[i]%x==0)
    {
        k=i;
        break;
    }

}
for(int i=k-1;i>=0;i--)
{
    if(a[i]%x==0)
    {
        l=i;
        break;
    }
}
for(int i=l+1;i<k;i++)
{
    a[i]=x;
}
for(int i=0;i<n;i++)
{
    printf("%d ",a[i]);
}
}
