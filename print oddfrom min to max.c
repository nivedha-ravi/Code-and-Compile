#include<stdio.h>
#include <stdlib.h>
void printOddFromMinToMax(int A,int B,int C)
{
int minVal = (A < B && A < C) ? A : (B < C ? B : C);
int maxVal = (A > B && A > C) ? A : (B > C ? B : C);
for(int ctr = minVal; ctr <= maxVal; ctr++)
{
if(ctr % 2 != 0)
{
printf("%d ",ctr);
}
}
}
int main()
{
int X, Y, Z;
scanf("%d%d%d",&X,&Y,&Z);
printOddFromMinToMax(X, Y, Z);
return 0;
}
