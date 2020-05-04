/*
The program must accept N integers as the input.
The program must print the current integer and previous X integers for the each of the N integers where X is the unit digit value of the current integer.
Note:
The first integer has no previous integer. So print only the first integer as the output.
If there are no X previous integers then print only the available integers.
Boundary Condition(s):
1 <= N <= 10^4
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains current integer and X previous integers separated by space(s).
Example Input/Output 1:
Input:
6 16 121 12 15 20 23
Output:
16 121 16 12 121 16 15 12 121 16 20 23 20 15 12
Explanation:
Consider 16. Here X = 6. But as there is no previous value. So we just print 16.
Consider 121. Here X = 1. So we print 1 previous value after printing 121. Hence the output is 121 16.
Consider 12. Here X = 2. So we print 12 and previous two integer values which are 12 121 16.
Consider 15. Here X = 5. So we print 15 followed by 12 121 16 (As there are no previous five values we print till the first value and stop).
Consider 20. Here X = 0. So we stop with just printing 20 (As zero previous values are to be printed).
Consider 23. Here X = 3.
So we print 23 followed by the previous three values 20 15 12.
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d\n",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d ",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(i==0)
        {
            printf("%d ",a[i]);
        }
        else
        {
            int unit=a[i]%10;
            if(unit==0)
            {
                printf("%d ",a[i]);
            }
            else
            {
           for(int j=i;j>=i-unit;j--)
           {    if(j<0)
           {
               break;
           }
               printf("%d ",a[j]);
           }
            }
        }

    }


}
