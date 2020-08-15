int isVowel(char ch)
{
    ch=tolower(ch);
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
void removeVowels(char str[])
{
    int vowel=-1;
    for(int i=0;i<strlen(str);i++)
    {
        if(!isVowel(str[i]))
        {
           str[++vowel]=str[i];
        }
    }
    str[++vowel]='\0';
}
