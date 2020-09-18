void printMissingCharacter(char sentStr[], char receivedStr[])
{
    int si=0,ri=0;
    while(sentStr[si])
    {
        if(sentStr[si]!=receivedStr[ri])
        {
            printf("%c",sentStr[si]);
            return;
        }

            si++;
            ri++;

    }
    printf("NA");
}
