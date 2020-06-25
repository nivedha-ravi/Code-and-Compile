/*
INPUT:
CDCDDCCCCDD
OUTPUT:
yes
INPUT:
CCCCCDCDDD
OUTPUT:
NO
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{int i;
 char s[101];
 scanf("%s",s);
 for(i=0;i<strlen(s);i++)
 {

     if(s[i] == 'C' && s[i+1] == 'D' && s[i+2] == 'D')
      {
          i+=2;
          continue;
      }
      else if(s[i] == 'C' && s[i+1] == 'D')
      {
          i++;
          continue;
      }
      else if(s[i] == 'C')
      {
          continue;
      }
      else
      {
          printf("no");
          return;
      }
 }
 printf("yes");
}
