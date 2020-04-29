"""
INPUT:
abcdexyzbwqpoolj
OUTPUT:
p
"""
ch=input()
ch=list(ch)
key='f'
for i in  range(len(ch)-1,1,-1):
    for j in range(1,i):
        if(ch[i]==ch[j]):
            print(ch[j])
            key='a'
            break
    if(key=='a'):
        break
