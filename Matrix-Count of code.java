/*
Example Input/Output 1:
Input: 2 5
x c o c E
x d e d o
Output: 2
Explanation:
The characters in the first 2x2 sub-matrix are x, c, x and d.
The characters in the second 2x2 sub-matrix are c, o, d and e.
The characters in the third 2x2 sub-matrix are o, c, e and d.
The characters in the fourth 2x2 sub-matrix are c, E, d and o.
The second and the third 2x2 sub-matrices contain the characters of the string "code" .
So 2 is printed as the output.
Example Input/Output 2:
Input: 4 4
c d C 3
e o E D
d c o d
# d e c
Output: 4
Example Input/Output 3:
Input: 3 4
B C e $
4 o D e
8 T o c
Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        int k=0;
        String m1[]=new String[10000];
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=m-2;j++){
                String d="";
                for(int x=i;x<i+2;x++){
                    for(int y=j;y<j+2;y++){
                        d+=a[x][y];
                    }
                }
                char c[]=d.toCharArray();
                Arrays.sort(c);
                String f=new String(c);
                m1[k++]=f;
            }
        }
        int count=0;
        for(int i=0;i<k;i++){
            if(m1[i].equals("cdeo")){
                count++;
            }
        }
        System.out.print(count);
	  }
}
