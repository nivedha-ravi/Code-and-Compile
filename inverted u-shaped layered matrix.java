/*
Example Input/Output 1:
Input: 5 4
# x s b
n k h n
C $ O @
w # L p
P L Q b
Output:
P w C n # x s b n @ p b
L # $ k h O L Q
Explanation:
The inverted U-shaped layers in the 5x4 matrix are highlighted below.
# x s b n k h n C $ O @ w # L p P L Q b Hence the output is P w C n # x s b n @ p b L # $ k h O L Q
Example Input/Output 2:
Input: 8 6
N z b P f H
J p g L ! m
X w x Y K g
c q o G @ m
V k D s e C
l y o O h O
F E T U Z l
g ! l a z 2
Output:
g F l V c X J N z b P f H m g m C O l 2
! E y k q w p g L ! K @ e h Z z
l T o D o x Y G s O U a
Example Input/Output 3:
Input: 3 6
v r p i m k
h a d s i r
t c r k t b
Output:
t h v r p i m k r b
c a d s i t
r k
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char a[][]=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.next().charAt(0);
		    }
		}
    int left=0,right=c-1,top=0;
    while(left<right & top<r){
    for(int i=r-1;i>=top;i--){
        System.out.print(a[i][left]+" ");
    }
    for(int j=left+1;j<=right;j++){
        System.out.print(a[top][j]+" ");
    }
    for(int k=top+1;k<r;k++){
        System.out.print(a[k][right]+" ");
    }
    System.out.println();
    left++;
    right--;
    top++;
    }
	}
}
