"""
Four towers A, B, C, D are to be erected.
Tower A is to communicate with tower C.
Tower B is to communicate with tower D.
Line of sight issue can occur under the following conditions-
 when tower B or D is in the straight line connecting A and C-
 when tower A or C is in the straight line connecting B and D
The program must accept the co-ordinates of all four towers and print yes or no depending on whether Line of sight issue will occur or not.
Input Format:
The first line will contain X and Y co-ordinates of tower A separated by a space.
The second line will contain X and Y co-ordinates of tower B separated by a space.
The third line will contain X and Y co-ordinates of tower C separated by a space.
The fourth line will contain X and Y co-ordinates of tower D separated by a space
Output Format:The first line will contain yes or no (smaller case)
Boundary Conditions:The value of the co-ordinates will be from -500 to 500.
Example Input/Output 1:
0 0
0 -2
2 0
0 2
Output:
yes
Example Input/Output 2:
Input:
0 0
0 -2
2 0
0 -5
Output:
no
"""
ax,ay=input().strip().split(" ")
bx,by=input().strip().split(" ")
cx,cy=input().strip().split(" ")
dx,dy=input().strip().split(" ")
ax,ay,bx,by,cx,cy,dx,dy=int(ax),int(ay),int(bx),int(by),int(cx),int(cy),int(dx),int(dy)
flag,flag1=0,0
if((((bx<=ax and by<=cx)or(bx>=cx and bx>=ax)) and((by<=ay and by<=cy) or(by>=ay and by>=cy))) and(((dx<=ax and dx<=cx)or(dx>=cx and dx>=ax)) and((dy<=ay and dy<=cy) or(dy>=ay and dy>=cy)))):
    flag=1
if((((ax<=bx and ax<=dx)or(ax>=bx and ax>=dx)) and((ay<=by and ay<=dy)or(ay>=by and ay>=dy))) and(((cx<=bx and cx<=dx)or(cx>=bx and cx>=dx)) and((cy<=by and by<=dy)or(cy>=by and cy>=dy)))):
    flag1=1
if flag==1 and flag1==1:
    print("no")
else:
    print("yes")
