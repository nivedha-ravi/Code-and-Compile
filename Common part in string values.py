"""
Two string values S1 and S2 are passed as input. The last portion of S1 will be the first portion of S2. The program must print this common part in S1 and S2.
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains the common part.
Boundary Conditions:
Length of S1 and S2 will be from 3 to 100.
Example Input/Output 1:
Input:
mayday
daybreak
Output:
day
Example Input/Output 2:
Input:
bridge
gear
Output:
ge
"""
"""
nivi = input()
nivi= list(nivi)
swe= input()
swe= list(swe)
j = 0
for i in range(int(len(nivi)/2)-4,len(nivi)):
        for k in range(0,len(swe)):
            if j>=len(swe):
                break
            elif nivi[i] != swe[j]:
                break
            elif(nivi[i] == swe[j]):
                print(swe[j],end="")
            j+=1
