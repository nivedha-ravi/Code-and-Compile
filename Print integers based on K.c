/*
The program must accept an N numbers and an integer K as the input.
The program must print the first K integers and then consider the remaining N-K integers and print those which are not present in the first K integers as the output.
Boundary Condition(s):
1 <= N <= 10^5 1 <= K <= N
Input Format:
The first line contains the two integers N and K separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the first K integers and then remaining integers which are not present in the first K integers.
Example Input/Output 1:
Input:
7 3
1 2 4 5 3 2 5
Output:
1 2 4 5 3 5
Explanation:
The first three integers 1, 2 and 4 are printed.
The remaining integers are 5, 3, 2 and 5.
Here 2 is present in the first three integers. So 5, 3 and 5 are printed.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,k;
scanf("%d %d\n",&n,&k);
int a[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
    if(i<k)
    {
        printf("%d ",a[i]);
    }
}
for(int i=k;i<n;i++)
{   int j;
    for(j=0;j<k;j++)
    {
        if(a[i]==a[j])
        {
            break;
        }
    }
    if(j==k)
    {
        printf("%d ",a[i]);
    }
}


}
