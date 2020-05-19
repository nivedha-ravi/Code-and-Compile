#include <stdio.h>
#include <string.h>
int main()
{
char stringvalue[100];
scanf("%s", stringvalue);
int length = strlen(stringvalue);
char *ptr;
ptr=stringvalue+length-1;
do
{
printf("%c",*ptr);
}
while(ptr-- != &stringvalue[0]);
return 0;
}
