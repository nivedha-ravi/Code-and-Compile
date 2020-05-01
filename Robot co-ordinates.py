"""
The initial x and y co-ordinate values of a Robot are passed as the input.
The rest of the input values are the directions in which the Robot moves along with the distance in that direction.
The directions are denoted by N, E, S, W for North, East, South and West.
The program should print the final x and y co-ordinates of the Robot
INPUT:
x-2 y3 W3 N1
OUTPUT:
x-5 y4
"""
l=list(input().strip().split())
sumx,sumy=0,0
for i in range(len(l)):
    a=l[i]
    ch,s=a[0],str(a[1:])
    num=int(s)
    if ch=='x' or ch=='E':
        sumx=sumx+num
    elif ch=='W':
        sumx=sumx-num
    elif ch=='N' or ch=='y':
        sumy=sumy+num
    else:
        sumy=sumy-num
sumx=str(sumx)
sumy=str(sumy)
print("x"+sumx+" y"+sumy)
