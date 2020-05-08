/*
The program must accept N binary values as the input.
For each binary value, the program must print the 1's count and the 0's count as the output.
Boundary Condition(s):
1 <= N <= 100 1 <= Number of digits in each binary value <= 18
Example Input/Output 1:
Input:
5
10001110
1110000001
101111111001
1010001
1011
Output:
4 4
4 6
9 3
3 4
3 1
Example Input/Output 2:
Input:
3
10010000
100
10
Output:
2 6
1 2
1 1
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
int n;
scanf("%d",&n);
for(int i=0;i<n;i++)
{
    unsigned long long int val;
    scanf("%llu\n",&val);
    int zerocount=0,onecount=0;
    while(val>0)
    {
        if(val%10==1)
        {
            onecount++;
        }
        else
        {
            zerocount++;
        }
        val=val/10;

    }
    printf("%d %d\n",onecount,zerocount);
}

}
