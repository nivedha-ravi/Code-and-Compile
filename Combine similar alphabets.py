"""
The program must accept a string S and combine the similar alphabets (lower and upper case are similar) based on their order of occurrence.
Then the program must form a new string M by alternating the elements from first and last.
Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains M.
Example Input/Output 1:
Input:
HelLoWOrld
Output:
dWerHoOlLl
Explanation:
'd', 'e', 'H', 'lLl', 'oO', 'r', 'W' are the grouped similar alphabets. So d and W are printed first. Then e and r are printed.
Then H and oO are printed. Then lLl is printed.
Example Input/Output 2:
Input:
tapa
Output:
aatp
Example Input/Output 3:
Input:
u
Output:
u
"""
k=input()
ss=sorted(set(k.upper()))
fin=[]
for i in range(len(ss)):
    s=""
    for j in k:
        if ss[i]==j.upper():
            s+=j
    fin.append(s)
i,j=0,len(fin)-1
out=""
while i<=j:
    if i==j:
        out+=fin[i]
    else:
        out+=fin[i]+fin[j]
    i+=1
    j-=1
print(out)
