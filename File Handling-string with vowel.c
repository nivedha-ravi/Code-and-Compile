#include<stdio.h>
#include <stdlib.h>
int isVowel(char ch)
{
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
int containsVowel(char str[])
{
    for(int i=0;str[i];i++)
    {
        if(isVowel(str[i]))
        {
            return 1;
        }
    }
    return 0;
}
int main()
{
    char filename[101],word[101];
    scanf("%s",filename);
    FILE *fp=fopen(filename,"r");
    while(fscanf(fp,"%s",word)==1)
    {
        if(containsVowel(word))
        {
            printf("%s ",word);
        }
    }
    fclose(fp);


}
