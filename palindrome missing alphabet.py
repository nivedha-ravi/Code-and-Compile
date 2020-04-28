/*input :malayaam
output :l
*/

string=input()
l=list(string)
j=len(l)-1
for i in range(len(l)):
    if(l[i]!=l[j]):
        if(l[i]==l[j-1] and i!=j-1):
            print(l[j])
            break
        else:
            print(l[i])
            break
    j-=1
