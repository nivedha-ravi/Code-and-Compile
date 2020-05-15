/*
A string S is passed as the input to the program. The program must replace all the special characters in the string by the alphabets in alphabetical order.
If the replacement alphabet has reached up to 'z' then the next replacement alphabet must start from 'a'.
Finally, the program must print the modified string as the output.
Note:
The special characters must be replaced only by lowercase alphabets and all the special characters must be replaced by an alphabet except space.
Boundary Condition(s):
1 <= Length of string S <= 1000
Example Input/Output 1:
Input:
s@m%a;files
Output:
sambacfiles
Explanation:
The first special character is @ it must be replaced by the alphabet a. The second special character is % it must be replaced by the alphabet b.
The third special character is ; it must be replaced by the alphabet c.
Example Input/Output 2:
Input:
k@lv;n co][]
Output:
kalvbn cocde
*/
#include<stdio.h>
#include <stdlib.h>

int main()
{
char str[1001];
fgets(str,1001,stdin);
char c='a';
for(int i=0;i<strlen(str);i++)
{
    char s=str[i];
    if(s=='@'||s=='%'||s==';'||s=='['||s==']'||s=='*'||s=='^'||s=='!'||s=='#'||s=='&'||s=='$'||s=='('||s==')'||s=='_'||s=='['||s==']'||s=='{'||s=='}'||s=='?'||s==':'||s=='+'||s=='='||s=='>'||s=='<'||s=='|'||s=='/'||s==','||s=='.'||s=='"'||s=='-''||s=='\\'||s=='\''||s=='`'||s=='~')
    {
        if(c=='z')
        {

            printf("%c",c);
            c='a';


        }
        else
        {
            printf("%c",c);
            c++;
        }
    }
    else if(s==' ')
    {
        printf(" ");
    }
    else
    {
        printf("%c",s);
    }

}



}
