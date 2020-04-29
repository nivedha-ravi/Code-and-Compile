"""Input:
She is  happy
Output:
She Is  Happy
Input:
joIN tHE ParTY
Output:
JoIN THE ParTY"""
nivi=input()
l=list(nivi)
for i in range(len(l)):
    if(i==0):
        l[i]=l[i].capitalize()
    elif(l[i]==" "):
        l[i+1]=l[i+1].capitalize()
string=""
print(string.join(l))
