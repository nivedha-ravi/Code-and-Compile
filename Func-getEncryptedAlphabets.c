/*
The function/method getEncryptedAlphabet accepts two arguments - ch and K, a character representing an alphabet and an integer representing a key for the encryption. The function/method getEncryptedAlphabet must return the encrypted alphabet. To encrypt an alphabet, the alphabet is replaced by the following Kth alphabet with the same case in the English alphabet set. The English alphabetical set is considered in a cyclic fashion for the last K alphabets.
*/
char getEncryptedAlphabet(char ch, int K)
{
    if(islower(ch))
    {
        return (ch-'a'+K)%26+'a';
    }
    else
    {
        return (ch-'A'+K)%26+'A';
    }
}
