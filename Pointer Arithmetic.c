#include <stdio.h>
#include <stdlib.h>
int main()
{
char ch = 'a';
int arr[] = {10, 20, 30, 40, 50};
int matrix[][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
char *cptr = &ch;
int *ptr = arr;
int (*ptrToArr)[3] = matrix;
printf("%c %d %d", ++*cptr, *(ptr+=2), (*(ptrToArr+1))[1]);
return 0;
}
