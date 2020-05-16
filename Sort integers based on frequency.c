/*
INPUT:
6
10 20 30 20 10 10
OUTPUT:
30 20 20 10 10 10
*/
#include<stdio.h>
#include <stdlib.h>
#define LLI long long int
int main()
{
   LLI i,j,k,l,n,m,a[1001],a1[1001],count=0;
   scanf("%lld",&n);
   for(i=0;i<n;i++)
   {
       scanf("%lld",&a[i]);
   }
   for(i=0;i<n;i++)
   {
       count=0;
       for(j=0;j<n;j++)
       {
           if(a[i]==a[j])
           {
               count++;
           }
       }
       //printf("%lld\n",count);
       a1[i]=count;
   }
   for(i=0;i<n;i++)
   {
       for(j=0;j<n;j++)
       {
           if(a1[i]<a1[j])
           {
               k=a1[i];
               a1[i]=a1[j];
               a1[j]=k;
               k=a[i];
               a[i]=a[j];
               a[j]=k;
           }
           else if(a1[i]==a1[j])
           {
               if(a[i]<a[j])
               {
                   k=a[i];
                   a[i]=a[j];
                   a[j]=k;
               }
           }
       }
   }
   for(i=0;i<n;i++)
   {
       printf("%lld ",a[i]);
   }

}
