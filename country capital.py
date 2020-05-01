"""
Input data containing N countries and their capital will be provided as input.
The program must then print the capital for a given country.
Input Format:First line will contain the integer value N representing how many
country-capital pairs are to be provided as input.Next N lines will contain the name of the country
and the name of the captial as string values separated by a space.The last line will contain the name
of the country as a string value for which the capital is to be printed as output.
Output Format:First line will contain the capital of the country.
If the name of the country is NOT found in the input data then NONE must be printed as output.
Constraints:N will be from 2 to 100.
Sample Input/Output:Example 1:
Input:
5
Afghanistan Kabul
Austria Vienna
Armenia Yerevan
Chile Santiago
Croatia Zagreb
Austria
Output:
Vienna
Example 2:
Input:
4
Armenia Yerevan
Chile Santiago
Croatia Zagreb
Iran Tehran
Japan
Output:NONE
Explanation:
As Japan is not mentioned in the input data, NONE is printed as output.
"""
n=int(input())
l=[]
for i in range(n):
    l+=map(str,input().split())
e=input().strip()
for i in range(len(l)):
    if i+1<len(l) and l[i]==e:
        print(l[i+1])
        break
else:
    print("NONE")
