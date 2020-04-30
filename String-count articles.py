"""
input:
I went a! "movie", yesterday along with 'a 'old man.

output:
2
"""
a,b,c=input().strip(),"",""".",?!"""
for i in a:
    if i not in c:
        b+=i
l=list(map(str,b.split()))
a,c="A,THE,AN,a,The,An,an,the",0
for i in l:
    if i in a:
        c+=1
print(c)
