/*
Input:
8 5
Output:
8
16 17
24 25 26 27
32 33 34 35 36 37 38 39
40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n,x;
scanf("%d %d\n",&n,&x);
int colcount=1;
for(int i=1;i<=x;i++)
{   int printval=i*n;
   for(int col=1;col<=colcount;col++)
   {
      printf("%d ",printval);
      printval++;

   }
   printf("\n");
   colcount=colcount*2;
}

}
