"""
Input:
midinadiazne
3

Output:
madeinindiaz

Explanation:
m i d
a n i
d i a
e n z
Here z is the padding letter.
The navigating across the rows mid (left to right) ina (right to left)
and so on we come up with the encrypted message midinadiazne
"""
a=input().strip()
d=int(input())
l,li=[],[]
c,c1=0,0
for i in range(len(a)):
    li.append(a[i])
    c+=1
    if c==d:
        if c1%2!=0:
            li=li[::-1]
        l.append(li)
        li,c,c1=[],0,c1+1
for i in range(d):
    for j in range(c1):
        print(l[j][i],end="")
