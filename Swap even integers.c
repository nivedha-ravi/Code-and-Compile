/*
The program must accept N integers as the input.
The program must swap the first and the last even integers, then the program must swap the second and second but last even integers and so on.
Then the program must print the modified integers as the output.
Note: Number of even integers will be always even.
Boundary Condition(s): 1 <= N <= 10000
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format: The first line contains N integers separated by space(s).
Example Input/Output 1:
Input:
10 67 12 10 23 20 41 60 40 21 16
Output:
67 16 40 23 60 41 20 10 21 12
Explanantion:
The first and the last even elements are 12 and 16.
After swapping those the elements are 16 and 12 (67 16 10 23 20 41 60 40 21 12).
The second and the last from second even elements are 10 and 40.
After swapping those the elements are 40 and 10 (67 16 40 23 20 41 60 10 21 12).
The third and the last from third even elements are 60 and 20.
After swapping those elements are 20 and 60 (67 16 40 23 60 41 20 10 21 12).
Hence the output is 67 16 40 23 60 41 20 10 21 12
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
for(int i=0,j=n-1;i<j;)
{
    if(a[i]%2==0)
    {
        if(a[j]%2==0)
        {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
        }
        else if(a[j]%2!=0)
        {
            j--;
        }
    }
    else if(a[i]%2!=0 && a[j]%2==0)
    {
        i++;
    }
    else if(a[i]%2!=0 && a[j]%2!=0)
    {
        i++;
        j--;
    }

}
for(int i=0;i<n;i++)
{
    printf("%d ",a[i]);
}

}
