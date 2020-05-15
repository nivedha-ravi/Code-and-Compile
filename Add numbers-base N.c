#include<stdio.h>
#include <stdlib.h>
int base;
int find(int a);
int main()
{ int a,b,n=0,m=0;
  scanf("%d %d %d",&base,&a,&b);
  n=findii(a);
  m=findii(b);
  printf("%d",n+m);
    }
  int findii(int a){
      int t,mul,n=0,i=0;
      mul=base;
  while(a){
      t=a%10;
      if(i==0)
       n=t;
       else{
           n=n+(t*mul);
           mul=mul*base;
       }
       i++;
       a=a/10;
  }
 return n;
}
