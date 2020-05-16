/*
 The program must accept two integers X and Y as the input.
 The program must print the integers from X (inclusive) to Y (inclusive) in which has all of its digits as even.
 If there is no such integer then the program must print -1 as the output.
 Boundary Condition(s): 1 <= X, Y <= 9999999
 Example Input/Output 1:
 Input:
 10 30
 Output:
 20 22 24 26 28
 Explanation:
 The integers from 10 to 30 are 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30.
 The integers which are formed using the even digits are 20 22 24 26 28. Hence the output is 20 22 24 26 28
 Example Input/Output 2:
 Input:
 4551 4591
 Output:
 -1
 */
#include<stdio.h>
#include <stdlib.h>

int main()
{
int x,y;
scanf("%d %d",&x,&y);
int flag=0;
for(int i=x;i<=y;i++)
{
    int curr=i;
    while(curr%2==0 && curr>0)
    {
        curr/=10;
    }
    if(curr==0)
    {
        printf("%d ",i);
        flag=1;
    }
}
if(flag==0)
{
    printf("-1");
}

}
