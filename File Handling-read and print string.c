#include<stdio.h>
#include <stdlib.h>

int main()
{
    char filename[101];
    scanf("%s",filename);
    FILE *fp=fopen(filename,"r");
    char str[1001];
    fscanf(fp,"%[^\n]",str);
    printf("%s",str);
    fclose(fp);

}
