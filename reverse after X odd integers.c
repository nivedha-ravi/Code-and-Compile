/*
The program must accept N integers and an integer X as the input.
The program must reverse all the integers occurring after the first X odd integers and print it as the output.
If the program contains exactly X odd integers among N integers then print -1 as the output.
Note:
Atleast X odd integers among N integers.
Boundary Condition(s):
1 <= N <= 10^4 1 <= X <= 1000
Input Format:
The first line contains the two integers N and X separated by a space.
The second line contains N integers separated by space(s).
Output Format:
The first line contains either reverse all the integers occuring after the first X odd integers or -1.
Example Input/Output 1:
Input:
9 3 10 5 17 22 90 89 20 85 54
Output:
54 85 20
Explanation:
X = 3, The first three odd elements are 5, 17 and 89 (10 5 17 22 90 89 20 85 54).
After three odd elements, the elements in the reverse order are 54, 85 and 20.
Hence the output is 54 85 20
Example Input/Output 2:
Input:
5 2 10 20 15 30 25
Output:
-1
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
int count=0,k;
for(int i=0;i<n;i++)
{
    if(a[i]%2!=0)
    {
        count++;
        if(count==x)
        {
            k=i;
        }
    }
}
if(count<=x)
{
    printf("-1");
}
else
{
    for(int j=n-1;j>k;j--)
    {
        printf("%d ",a[j]);
    }
}


}
