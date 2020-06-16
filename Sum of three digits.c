/*
The program must accept a three digit number N as the input. The program must print the sum of the three digits if all the digits are equal. If any two digits of N are equal, then print the sum those digits which are equal. If all the three digits are different, then the program must print -1 as the output. Example Input/Output 1: Input: 222 Output: 6 Example Input/Output 2: Input: 123 Output: -1 Example Input/Output 3: Input: 191 Output: 2
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,n1,n2,n3;
    scanf("%d\n",&n);
    n1=n%10;
    n2=(n/10)%10;
    n3=(n%1000)/100;
    if(n1==n2 && n2==n3 && n3==n1)
    {
        printf("%d",n1+n2+n3);
    }
    else if(n1==n2)
    {
        if(n2!=n3)
        {
            printf("%d",n1+n2);
        }
    }
    else if(n2==n3)
    {
        if(n3!=n1)
        {
            printf("%d",n2+n3);
        }
    }
    else if(n3==n1)
    {
        if(n1!=n2)
        {
            printf("%d",n1+n3);
        }
    }
    else
    {
        printf("-1");
    }


}
