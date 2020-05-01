"""
Anmol wants to encrypt the message  which is to be sent to his business partner.Binamol,  so he shifts every alphabet by X positions in forward direction and he adds Y ro every number in the message.

Given string value M of the message  and the values of X and Y, the program must print the encrypted message E.

->All alphabets will be lowercase.
->Spaces and special characters in message M should be reproduced as such in the encrypted message E.

Example 1:

Input:
call me at 10p.m
2
1
Output:
ecnn og cv 21r.o
"""
l=list(input().strip())
x=int(input())
y=int(input())
for i in range(len(l)):
    if l[i].isalpha():
        if ord(l[i])+x>ord('z'):
            print(chr(ord(l[i])+x+ord("a")-1-ord("z")),end="")
        else:
            print(chr(ord(l[i])+x),end="")
    if l[i].isdigit():
        print(int(l[i])+y,end="")
    if l[i]==' ' or l[i]=='.' or l[i]=='!':
        print(l[i],end="")
