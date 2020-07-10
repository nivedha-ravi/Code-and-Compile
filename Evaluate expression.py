/*
The program must accept a string S representing a mathematical expression as the input.
The program must evaluate and print the result R as the output.
Input Format: The first contains S.
Output Format: The first line contains an integer representing the result R.
Example Input/Output 1:
Input:
((4+6)*(15/5))+100
Output:
130
Example Input/Output 2:
Input:
(10/3)*(5+4)
Output:
30
Example Input/Output 3:
Input:
100-(12/5)
Output:
97
*/
import math
code=compile(input().strip(),"<string>","eval")
print(int(eval(code)))
