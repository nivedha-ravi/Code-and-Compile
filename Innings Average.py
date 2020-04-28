n=int(input())
sa,sb=0.0,0.0
for i in range(n):
    a=input()
    w=list(a.split())
    for j in range(len(w)):
        w[j]=int(w[j])
    t1=w[0]
    t2=w[1]
    sa+=t1
    sb+=t2
fa="{:.2f}".format(sa/n)
fb="{:.2f}".format(sb/n)
print(fa)
print(fb)
