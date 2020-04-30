"""
INPUT:
12+7=5
OUTPUT:
-
"""
a=input().strip()
a,b=map(str,a.split("="))
c=""
for i in range(len(a)):
    if a[i] in "+-/*":
        a,c=a[:i],a[i+1:]
        break
for i in "+-/*":
    if(eval(a+i+c)==int(b)):
        print(i)
        break
