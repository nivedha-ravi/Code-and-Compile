/*
The program must accept two positive integer arrays of size N1 and N2.
The program must print the common elements in both the arrays in the ascending order as the output.
If both the arrays have no common elements then the program must print -1 as the output.
INPUT:
5 7 1 2 4 8 0 10 23 2 8 10 0 1
Output:
0 1 2 8
Input:
6 4 4 1 9 2 16 2 0 5 10 15
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,m,flag=0;
scanf("%d %d\n",&n,&m);
int a[n],b[m],c[51],k=0;
for(int i=0;i<n;i++)
{
    scanf("%d ",&a[i]);
}
for(int i=0;i<m;i++)
{
    scanf("%d ",&b[i]);
}
for(int i=0;i<n;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
            a[j]=-1;
        }
    }
}
for(int i=0;i<m;i++)
{
    for(int j=i+1;j<m;j++)
    {
        if(b[i]==b[j])
        {
          b[j]=-1;
        }
    }
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        if(a[i]==b[j] && b[j]!=-1 && a[i]!=-1)
        {
            c[k++]=a[i];
            flag=1;
        }
    }
}if(flag==1)
{
for(int i=0;i<k;i++)
{
    for(int j=i+1;j<k;j++)
    {
        if(c[i]>c[j])
        {
            int temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }
    }
}
for(int i=0;i<k;i++)
{
    printf("%d ",c[i]);
}
}
else
{
    printf("-1");
}


}
