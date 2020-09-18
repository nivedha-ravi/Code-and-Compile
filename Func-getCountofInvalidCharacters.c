/*
The function/method getCountOfInvalidCharacters accepts an argument - text, a character array representing the text entered by a person. The function/method getCountOfInvalidCharacters must return an integer representing the number of invalid characters in the text. The text given to the person to type always contains only alphabets, digits and spaces. So the other characters(special characters) are considered to be invalid characters.
*/
int getCountOfInvalidCharacters(char text[])
{
    int count=0;
    for(int i=0;i<strlen(text);i++)
    {
        if(!(isdigit(text[i])|| isalpha(text[i]) || text[i]==' '))
        {
            count++;
        }
    }
    return count;
}
