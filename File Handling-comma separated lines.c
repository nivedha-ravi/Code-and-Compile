#include<stdio.h>
#include <stdlib.h>

int main()
{
char filename[101],ch;
scanf("%s",filename);
FILE *fp=fopen(filename,"r");
while(fscanf(fp,"%c",&ch)==1)
{
    if(ch=='\n')
    {
        printf(",");
    }
    else if(ch!='\r')
    {
        printf("%c",ch);
    }
}
fclose(fp);

}
