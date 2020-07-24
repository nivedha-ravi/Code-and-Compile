/*
Input:
b 2
d 9
Output:
b2 b3 b4 b5 b6 b7 b8 b9 b10 c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 d1 d2 d3 d4 d5 d6 d7 d8 d9
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char ch1,ch2;
int x,y;
scanf("%c %d\n%c %d",&ch1,&x,&ch2,&y);
int ctr=x,max;
while(ch1<=ch2)
{
    max=ch1<ch2?10:y;
        while(ctr<=max)
        {
            printf("%C%d ",ch1,ctr);
            ctr++;
        }
        ch1++;
        ctr=1;

}


}
