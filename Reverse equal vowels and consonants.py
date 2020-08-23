def vow(s):
    c=0
    v='aeiouAEIOU'
    for i in s:
        if i in v:
            c+=1
    return c
l=input().split()
for i in l:
    if vow(i)==len(i)-vow(i):
        print(i[::-1],end=' ')
    else:
        print(i,end=' ')
