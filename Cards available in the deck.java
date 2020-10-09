/*
Input Format:
The first line contains N.
The second line contains the names of N cards separated by a space.
Output Format:
The first four lines, each contains the name of a suit and the cards available in the suit based on the given conditions.
Example Input/Output 1:
Input:
10
AD 2D 3D 4S 5C 6C JH QH KH AH
Output:
C - 5 6
D - A 2 3
H - A J Q K
S - 4
Explanation:
Here N=10. The given 10 cards are AD, 2D, 3D, 4S, 5C, 6C, JH, QH, KH and AH.
Suit C contains 2 cards - 5C 6C.
Suit D contains 3 cards - AD 2D 3D.
Suit H contains 4 cards - AH JH QH KH.
Suit S contains 1 card - 4S.
Hence the output is
C - 5 6
D - A 2 3
H - A J Q K
S - 4
Example Input/Output 2:
Input:
7
JS 5H 8C 2S 6H KC KH
Output:
C - 8 K
D - *
H - 5 6 K
S - 2 J
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        String b[]=new String[n];
        String c[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<n;i++){
            String s[]=sc.next().split("");
            if(s.length==3)
                a[i]=s[0]+s[1];
            else
                a[i]=s[0];
            b[i]=s[s.length-1];
        }
        String p[]={"C","D","H","S"};
        String e[]=new String[n];
        for(int i=0;i<4;i++){
            System.out.print(p[i]+" - ");int u=0;
            for(int k=0;k<n;k++){
                if(b[k].equals(p[i]) )
                    e[u++]=a[k];
            }
            if(u==0)
                System.out.print("*");
            else{
                for(int k=0;k<13;k++){
                    for(int j=0;j<u;j++){
                        if(c[k].equals(e[j]))
                            System.out.print(e[j]+" ");
                    }
                }
            }
            System.out.println();
        }
	  }
}
