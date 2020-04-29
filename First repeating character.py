"""
INPUT:
abcdexyzbwqpoolj
OUTPUT:
b
"""

ch=input()
ch=list(ch)
key='f'
for i in range(0,len(ch)-1):
    for j in range(i+1,len(ch)):
        if(ch[i]==ch[j]):
            print(ch[j])
            key="a"
            break
    if(key=='a'):
        break
