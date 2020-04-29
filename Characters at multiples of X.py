"""
INPUT:
abcdefgxyzlmnoopqi
5
OUTPUT:
ezo
"""



string=input()
ch=list(string)
x=int(input())
for i in range(len(ch)):
    if (i+1)%x==0:
        print(ch[i],end="")
