/*
The program must accept N integers as the input.
The program must print only the integers which are palindrome.
If there is no palindromic integer in the given N integers then the program must print -1 as the output.
Boundary Condition(s): 1 <= N <= 100
Example Input/Output 1:
Input:
5
6776
8989
25252
181
323
Output:
6776
25252
181
323
Example Input/Output 2:
Input:
3
1010
2221
3233
Output:
-1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d\n",&n);
int a[n],flag=0;
for(int i=0;i<n;i++)
{
    scanf("%d\n",&a[i]);
    int temp=a[i];
    int num=a[i];
    int sum=0;
    while(num>0)
    {
        sum=(sum*10)+(num%10);
        num=num/10;
    }
    if(sum==temp)
    {
        printf("%d\n",temp);
        flag=1;
    }
}
if(flag==0)
{
    printf("-1");
}

}
