"""
INPUT:
909
OUTPUT:
919
"""
n=int(input())
while True:
    n+=1
    string=str(n).strip()
    st=string[::-1]
    if(st==string):
        print(st)
        break
