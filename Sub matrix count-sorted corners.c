
#include<stdio.h>
#include <stdlib.h>

int main()
{
  int r,c,k,c1=0;
  scanf("%d%d",&r,&c);
  int m[r][c],l[1001];
  for(int i=0;i<r;i++)
  {
      for(int j=0;j<c;j++)
      {
          scanf("%d",&m[i][j]);
      }
  }
  scanf("%d",&k);
  for(int i=0;i<=r-k;i++)
  {
      for(int j=0;j<=c-k;j++)
      {
          int p=m[i][j];
          int q=m[i][j+k-1];
          int r=m[i+k-1][j+k-1];
          int s=m[i+k-1][j];
          if(p<=q && q<=r && r<=s)
          {
              c1++;
          }
      }
  }
  printf("%d",c1);

}
