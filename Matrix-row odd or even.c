/*
Input:
5 4
12 45 22 84
11 79 99 50
10 20 30 56
91 15 45 64
88 17 40 32
Output:
Yes
Explanation:
The elements in the 1st row and 5th row are 12 45 22 84 88 17 40 32 The corresponding column elements in the 1st row and 5th row are either odd or even.
The elements in the 2nd row and 4th row are 11 79 99 50 91 15 45 64 The corresponding column elements in the 2nd row and 4th row are either odd or even.
The 3rd row is not considered as it is in the middle.
Hence the output is Yes
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int r,c;
scanf("%d %d",&r,&c);
int a[r][c];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        scanf("%d ",&a[i][j]);
    }
}
int toprow=0,bottomrow=r-1;
while(toprow<bottomrow)
{
    for(int j=0;j<c;j++)
    {
        if(a[toprow][j]%2!=a[bottomrow][j]%2)
        {
            printf("No");
            return 0;
        }
    }
    toprow++;
    bottomrow--;
}
printf("Yes");
}
