/*
The program must accept a string S with space as the input. The program must print the first part of the string which contains only the alphabets a, b and c as the output
INPUT:
aabbccdeerweaadbb
OUTPUT:
aabbcc
*/
#include <stdio.h>
#include <stdlib.h>
int main()
{
char str[1001];
scanf("%[abc]", str);
printf("%s", str);
}
