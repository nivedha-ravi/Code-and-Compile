"""An odd length string S is passed as the input. The middle three letters of S must be printed as the output.

Input Format:
First line will contain the string value S

Output Format:
First line will contain the middle three letters of S.

Boundary Conditions:
Length of S is from 5 to 100

Example Input/Output 1:
Input:
level

Output:
eve

Example Input/Output 2:
Input:
manager

Output:
nag"""

string=input()
le=len(string)
m=le//2
print(string[m-1:m+2])
