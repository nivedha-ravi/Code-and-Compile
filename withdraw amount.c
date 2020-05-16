/*
Ravi has Rs. X in his bank account. He needs to withdraw all the amount from his account but he can withdraw only the amount so that the current balance is divisible by the withdrawn amount and also he can withdraw once in a day. So every day he decides to withdraw the maximum possible amount that he can withdraw on that day. The program must accept an integer X as the input. The program must print the number of days he needed to withdraw all the amount form his account as the output. Note: If the account balance is Rs. 1 then he can withdraw Rs. 1 from his account.
Input:
15
Output:
6
Explanation:
Ravi has Rs. 15 in his account.
In the first day, he withdraws Rs. 5 because 15 is divisible by 5. Now the balance amount is Rs. 10.
In the second day, he withdraws Rs. 5 because 10 is divisible by 5. Now the balance amount is Rs. 5.
In the third day, he withdraws Rs. 1 because5 is divisible by 1. Now the balance amount is Rs. 4.
In the fourth day, he withdraws Rs. 2 because 4 is divisible by 2. Now the balance amount is Rs. 2.
In the fifth day, he withdraws Rs. 1 because 2 is divisible by 1.
Now the balance amount is Rs. 1. In the sixth day, he withdraws Rs. 1 because Rs. 1 is the current balance.
Now the balance amount is Rs. 0. So Ravi needs 6 days to withdraw all the amount from his account. Hence the output is 6
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int amount,noofdays=0,wdamt;
scanf("%d",&amount);
while(amount>0)
{
    wdamt=(amount/2>0)?(amount/2):1;
    while(amount%wdamt!=0)
    {
        wdamt--;
    }
    amount-=wdamt;
    noofdays++;
}
printf("%d",noofdays);

}
