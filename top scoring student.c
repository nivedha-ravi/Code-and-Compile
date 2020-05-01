/*
INPUT:
4
Sasikumar:50:60:70
Arun:60:40:90
Manoj:50:50:60
Rekha:60:35:45
OUTPUT:
Arun
*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
int n;
scanf("%d\n",&n);
char marks[100],maxmarks[100];
int maths,phy,chem,maxmark=0;
while(scanf("%[^:]:%d:%d:%d\n",marks,&maths,&phy,&chem)>0)
{
int sum;
sum=maths+phy+chem;
if(sum>maxmark)
{
maxmark=sum;
strcpy(maxmarks,marks);
}
}
printf("%s",maxmarks);
}
