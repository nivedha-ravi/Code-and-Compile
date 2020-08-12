/*
Toggle B Bits
The program must accept two integers N and B as the input.
The program must toggle the last B bits of the binary representation N.
Then the program must print the decimal equivalent D of the modified binary representation of N as the output.
Boundary Condition(s):
1 <= N <= 10^8
1 <= B <= Number of bits in the binary representation N
Input Format:
The first line contains N and B separated by a space.
Output Format:
The first line contains D.
Example Input/Output 1:
Input:
10 3
Output:
13
Explanation:
The binary representation of the integer 10 is 1010.
After toggling the last 3 bits, the binary representation becomes 1101.
The decimal equivalent of the binary representation 1101 is 13. Hence the output 13.
Example Input/Output 2:
Input:
10 2
Output:
9
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,b;
    scanf("%d %d",&n,&b);
    printf("%d",n^((1<<b)-1));

}
