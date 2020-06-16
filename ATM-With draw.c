/*
In an ATM there are A number of 100 rupee notes and B number of 500 rupee notes. A person wants to withdraw X rupees from his bank account using the ATM. The program accepts the values of A, B and X as the input. The program must print the output based on the conditions given below. - If the amount X is not a multiple of 100 then the program must print Invalid Amount as the output. - If the amount X cannot be disbursed using the available denominations then the program must print Insufficient Money as the output. - If the amount X can be disbursed using the available denominations then the program must print Collect Your Cash as the output. Example Input/Output 1: Input: 2 3 700 Output: Collect Your Cash Example Input/Output 2: Input: 7 1 1500 Output: Insufficient Money Example Input/Output 3: Input: 2 10 1800 Output: Insufficient Money Example Input/Output 4: Input: 2 10 1250 Output: Invalid Amount
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,x;
    scanf("%d %d %d",&a,&b,&x);
    if(x%100==0)
    {
        if((a*100) && (b*500)==x)
        {
            printf("Collect Your Cash");
        }
        else if((a*100)&&(b*500)<x)
        {
            printf("Insufficient Money");
        }
        else if((a*100)&&(b*500)>x)
        {
            int t=x/500;
            if((b>=3) && (x-(t*500))<=(a*100))
            {
                printf("Collect Your Cash");
            }
            else
            {
                printf("Insufficient Money");
            }
        }
    }
    else if((a*100)+(b*100)>x)
    {
        printf("Collect Your Cash");
    }
    else
    {
        printf("Invalid Amount");
    }


}
