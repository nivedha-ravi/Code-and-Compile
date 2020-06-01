/*
The program must accept an integer matrix of size NxN as the input. The program must print Yes if sum of each row and sum of each column are equal to the sum of left diagonal elements. Else the program must print No as the output.
Input:
5
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
Output:
Yes
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
int a[n][n],rsum[n],csum[n],diagsum=0;
for(int i=0;i<n;i++)
{
    rsum[i]=0;
    csum[i]=0;
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
        scanf("%d ",&a[i][j]);
        rsum[i]+=a[i][j];
        csum[j]+=a[i][j];
        if(i==j)
        {
            diagsum+=a[i][j];
        }
    }
}
for(int i=0;i<n;i++)
{
    if(diagsum!=rsum[i]||diagsum!=csum[i])
    {
        printf("No");
        return 0;
    }
}
printf("Yes");
return 0;

}
