"""
INPUT:
cake
OUTPUT:
keca
INPUT:
innovation
OUTPUT:
vtonia
"""
string=list(input().strip())
string.sort()
string=string[::-1]
b=""
for i in string:
    if i not in b:
        b+=i
print(b)
