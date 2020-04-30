"""
Alternate letters in uppercase
A string (only alphabets) is passed as input.
The printed output should contain alphabets in odd positions in each word in uppercase and alphabets in even positions in a word in lowercase.
Example input and output:
If the input is 'tREE GiVES us fruiTS', the output should be 'TrEe GiVeS Us FrUiTs
'If the input is 'FLoweR iS beauTIFUL', the output should be 'FlOwEr Is BeAuTiFuL'
"""
s=list(input().split(" ")
for i in range(0,len(s)):
    l=list(s[i])
    for j in range(0,len(l)):
        if j%2==0:
            print(l[j].upper(),end="")
        else:
            print(l[j].lower(),end="")
    print(" ",end="")
