/*
The CEO of company ABC Inc wanted to encourage the employees coming on time to the office. So he announced that for every consecutive day an employee comes on time in a week (starting from Monday to Saturday), he will be awarded Rs.200 more than the previous day as "Punctuality Incentive". The incentive I for the starting day (ie on Monday) is passed as the input to the program. The number of days N an employee came on time consecutively starting from Monday is also passed as the input. The program must calculate and print the "Punctuality Incentive" P of the employee.

Input Format: The first line denotes the value of I. The second line denotes the value of N.

Output Format: The first line denotes the value of P.

Example Input/Output:
Input:
500
3

Output:
2100

Explanation: On Monday the employee receives Rs.500, on Tuesday Rs.700, on Wednesday Rs.900 So total = Rs.2100
*/
#include <bits/stdc++.h>

using namespace std;

int main(int argc, char** argv)
{
int i,n,j,s;
cin>>i>>n;
s=i;
for(j=0;j<n-1;j++)
{
    s+=200;
    i+=s;
}
if(n==0)
{
    printf("0");
}
else
{
    printf("%d",i);
}
}
