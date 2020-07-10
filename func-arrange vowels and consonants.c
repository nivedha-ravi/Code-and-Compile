int isVowel(char ch)
{
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
char* arrangeVowelsAndConsonants(char str[])
{
    int len=strlen(str),k=0;
    char *s=(char*)malloc(sizeof(char)*len);
    for(int i=0;i<len;i++)
    {
        if(isVowel(str[i]))
        {
            s[k++]=str[i];
        }
    }
    for(int i=0;i<len;i++)
    {
        if(!isVowel(str[i]))
        {
            s[k++]=str[i];
        }
    }
    s[k]='\0';
    return s;
}
