/*
The program must accept N integers and an integer X as the input.
The program must find the sum of the first X integers as S1 and then find the sum of the last X integers as S2.
Finally, the program must print the sum of S1 and S2 as the output.
Boundary Condition(s):
1 <= N <= 1000 1 <= X <= N
Input Format:
The first line conatins the integer N. The second line contains N integers separated by space(s). The third line contains the integer X.
Output Format:
The first line contains the sum of S1 and S2.
Example Input/Output 1:
Input:
8 1 2 3 4 5 6 7 8 3
Output:
27
Explanation:
The first 3 integers are 1, 2 and 3 and their sum (S1) is 6 (1 + 2 + 3).
The last 3 integers are 6, 7 and 8 and their sum (S2) is 21 (6 + 7 + 8).
The sum of S1 and S2 is 27 (6+21). Hence the output is 27
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,x;
    scanf("%d\n",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d ",&a[i]);
    }
    scanf("\n%d",&x);
    int sum1=0,sum2=0;
    for(int i=0;i<x;i++)
    {
        sum1=sum1+a[i];
    }
    for(int j=n-1;j>=n-x;j--)
    {
        sum2+=a[j];
    }
    printf("%d",sum2+sum1);
}
