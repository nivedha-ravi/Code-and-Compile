/*
The characters from the center to the east represent the 0-degree or 360-degree rotation of the string S.
The characters from the center to the south-east represent the 45-degree rotation of the string S.
The characters from the center to the south represent the 90-degree rotation of the string S.
The characters from the center to the south-west represent the 135-degree rotation of the string S.
The characters from the center to the west represent the 180-degree rotation of the string S.
The characters from the center to the north-west represent the 225-degree rotation of the string S.
The characters from the center to the north represent the 270-degree rotation of the string S.
The characters from the center to the north-east represent the 315-degree rotation of the string S.
The value of the degree X can be any one of the following.
0, 45, 90, 135, 180, 225, 270, 315 and 360.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains S. The second line contains X.
Output Format:
The line(s) contain the characters denoting the rotated string S.
Example Input/Output 1:
Input:
yellow
0
Output:
yellow
Explanation:
Here S = "yellow" and X = 0.
So the string S is printed as it is.
Example Input/Output 2:
Input:
CART 45
Output:
C
*A
**R
***T
Example Input/Output 3:
Input:
delhi
90
Output:
d
e
l
h
i
Example Input/Output 4:
Input:
fifteen
135
Output:
******f
*****i
****f
***t
**e
*e
n
Example Input/Output 5:
Input:
donkey
180
Output:
yeknod
Example Input/Output 6:
Input:
india
225
Output:
a
*i
**d
***n
****i
Example Input/Output 7:
Input:
MASTER
270
Output:
R
E
T
S
A
M
Example Input/Output 8:
Input:
library
315
Output:
******y
*****r
****a
***r
**b
*i
l
Example Input/Output 9:
Input:
abdevilliers
360
Output:
abdevilliers
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=sc.next().toCharArray();
        int n=sc.nextInt();
        if(n==0 || n==360){
            System.out.print(c);
        }else if(n==45){
           for(int i=0;i<c.length;i++){
               for(int j=0;j<=i;j++){
                   if(j==i) System.out.print(c[i]);
                   else System.out.print("*");
               }
               System.out.println();
           }
        }else if(n==90){
            for(int i=0;i<c.length;i++)
                System.out.println(c[i]);
        }else if(n==135){
            int k=c.length;
            for(int i=0;i<c.length;i++){
                for(int j=0;j<k;j++){
                    if(j==k-1) System.out.print(c[i]);
                    else System.out.print("*");
                }
                k--;
                System.out.println();
            }
        }else if(n==180){
            for(int i=c.length-1;i>=0;i--)
                System.out.print(c[i]);
        }else if(n==225){
            int k=c.length-1;
            for(int i=0;i<c.length;i++){
                for(int j=0;j<=i;j++){
                    if(j==i) System.out.print(c[k--]);
                    else System.out.print("*");
                }
                System.out.println();
            }
        }else if(n==270){
            for(int i=c.length-1;i>=0;i--)
                System.out.println(c[i]);
        }else if(n==315){
            int k=c.length,u=c.length-1;
            for(int i=0;i<c.length;i++){
                for(int j=0;j<k;j++){
                    if(k-1==j) System.out.print(c[u--]);
                    else System.out.print("*");
                }
                k--;
                System.out.println();
            }
        }
	}
}
