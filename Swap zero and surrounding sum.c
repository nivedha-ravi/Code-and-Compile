/*
INPUT:
5
2 8 3 9 2
6 9 2 3 9
2 3 2 0 1
1 0 4 6 3
5 7 4 7 6
OUTPUT:
2 8 3 9 2
6 9 2 0 9
2 0 0 12 0
0 15 0 0 3
5 0 4 7 6
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
 int i,j,k,a,b,c,d,e,f,n,l[100][100],s;
 scanf("%d\n",&n);
 for(i=0;i<n;i++)
 {
     for(j=0;j<n;j++)
     scanf("%d ",&l[i][j]);
     scanf("\n");
 }
 for(i=0;i<n;i++)
 {
     for(j=0;j<n;j++)
     {
         if(l[i][j]==0)
         {
             s=0;
             s+=l[i][j-1]+l[i][j+1]+l[i-1][j]+l[i+1][j];
             l[i][j]=s;
             l[i][j-1]=-1;
             l[i][j+1]=-1;
             l[i-1][j]=-1;
             l[i+1][j]=-1;
         }
     }
 }
 for(i=0;i<n;i++)
 {
     for(j=0;j<n;j++)
     {
         if(l[i][j]==-1)
         printf("0 ");
         else
         printf("%d ",l[i][j]);
     }
     printf("\n");
 }
}
