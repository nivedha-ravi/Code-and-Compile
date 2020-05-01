/*Anmol wants to encrypt the message  which is to be sent to his business partner.Binamol,  so he shifts every alphabet by X positions in forward direction and he adds Y ro every number in the message.

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
*/
#include<stdio.h>
#include<stdlib.h>

int main()
{
 char str[1000],s;
 int x,y,i=0,res;
 while(scanf("%c",&s)>0)
 {
 str[i]=s;
 i++;
 }

 x=str[i-5]-'0';//convertion of char to int
 y=str[i-2]-'0';
 i=i-7;



 for(int j=0;j<i;j++)  {
  if(isalpha(str[j]))  {
   char ree=str[j]+x;
    if(ree>122)
 {
 int h=ree-122;
 res=h+96;
 printf("%c",res);
 }
 else
 printf("%c",ree);
 }
 else if(isdigit(str[j]))
 {
 int c=str[j]-'0';
 printf("%d",c+y);
 }
 else
 printf("%c",str[j]);
 }

}
