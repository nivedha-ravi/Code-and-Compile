def isPrime(a):
    for i in range(2,a):
        if(a%i==0):
            return False
    return True

l=list(map(int,input().strip().split()))
n=len(l)
prime,even,odd=[],[],[]
for i in range(0,n):
    if(isPrime(l[i])):
        prime.append(l[i])
    elif not(l[i]%2==0):
        odd.append(l[i])
    else:
        even.append(l[i])
prime.sort()
odd.sort()
even.sort()
for i in range(len(prime)):
    print(prime[i],end=" ")
for j in range(len(odd)):
    print(odd[j],end=" ")
for k in range(len(even)):
    print(even[k],end=" ")

        
