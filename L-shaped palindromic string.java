/*
Example Input/Output 1:
Input: 5
m R m B a
a a A o B
l C d A M
A E C a R
Y A l a m
Output:
malAYAlam
RaCECaR
BoB
a
Explanation:
The string values formed by concatenating the characters in the L-shaped layers of the matrix are given below.
malAYAlam
RaCECaR
mAdAM
BoB
a
The palindromic string values in the above string values are
malAYAlam
RaCECaR
BoB
a
Example Input/Output 2:
Input: 6
d E s R T X
e V E a i T
t I v d a r
a T E n E s
r A T I V E
t r a t e d
Output:
detartrated
EVITATIVE
TiT
X
Example Input/Output 3:
Input: 4
a F k N
c M m u
Q v M A
d I c a
Output: N
*/

import java.util.*;
public class Hello {
    public static boolean isPal(String a){
        int l=a.length();
        String b="";
        for(int i=l-1;i>=0;i--){
            b+=a.charAt(i);
        }
        if(b.equals(a)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++){
            String dup="";
            for(int j=0;j<n-i;j++){
                dup+=c[j][i];
            }
            for(int k=i+1;k<n;k++){
                dup+=c[n-i-1][k];
            }
            if(isPal(dup)){
                System.out.println(dup);
            }
        }
	}
}
