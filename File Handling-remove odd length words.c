void removeOddLengthWordsInFile(char filename[])
{
    FILE *fp=fopen(filename,"r");
    char result[1001],word[101];
    result[0]='\0';
    while(fscanf(fp,"%s",word)==1)
    {
        if(strlen(word)%2==0)
        {
            strcat(result,word);
            strcat(result," ");
        }
    }
    fclose(fp);
    fp=fopen(filename,"w");
    fprintf(fp,"%s",result);
    fclose(fp);
}
