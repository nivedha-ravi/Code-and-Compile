/*
The program must accept three integer arrays of size N as the input.
The program must print the count of triplets (one from each array) at same positions such that the sum of two integers among them is equal to the third integer.
Bounary Condition(s):
1 <= N <= 10^4
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
The third line contains N integers separated by space(s).
The fourth line contains N integers separated by space(s).
Output Format:
The first line contains the count of triplets at same positions. 
Example Input/Output 1:
Input:
6
9 2 13 4 5 30
1 12 4 29 10 25
10 15 9 25 12 5
Output:
4
Explanation:
The 1st position in the first array and the second array elements are 9 and 1 and their sum is 10 which is equal to 10 (1st position in the third array element).
Now the count becomes 1.
The 3rd position in the second array and the third array elements are 4 and 9 and their sum is 13 which is equal to 13 (3rd position in the first array element).
Now the count becomes 2.
The 4th position in the first array and the third array elements are 4 and 25 and their sum is 29 which is equal to 29 (4th position in the third array element).
Now the count becomes 3.
The 5th position in the second array and the third array elements are 25 and 5 and their sum is 30 which is equal to 30 (5th position in the third array element).
Now the count becomes 4.
*/
Hence the output is 4
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n],b[n],c[n];
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
scanf("\n");
for(int i=0;i<n;i++)
{
    scanf("%d ",&b[i]);
}
scanf("\n");
for(int i=0;i<n;i++)
{
    scanf("%d ",&c[i]);
}
int count=0;
for(int i=0,j=0,k=0;i<n && j<n && k<n;i++,j++,k++)
{
    if(a[i]+b[j]==c[k]||b[j]+c[k]==a[i]||c[k]+a[i]==b[j])
    {
        count++;
    }
}
printf("%d",count);

}
