"""
INPUT:
the brown quick frog quick the
the
quick
OUTPUT:
1
"""
def find_min_dist(a,b,c):
    if c==b:
        return 1
    words=a.split(" ")
    length=len(words)
    mindist=length+1
    for i in range(length):
        if words[i]==b or words[i]==c:
            prev=i
            break
    while i<length:
        if words[i]==b or words[i]==c:
            if words[prev]!=words[i] and (i-prev)<mindist:
                mindist=i-prev
                prev=i
            else:
                prev=i
        i+=1
    return mindist

a=input().strip()
b=input().strip()
c=input().strip()
print(find_min_dist(a,b,c))
