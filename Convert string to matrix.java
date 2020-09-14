*
Example Input/Output 1:
Input:
all is well
4
Output:
# l l e
w * s i
* l l a
Explanation:
Here S = "all is well" and N = 4. So the pattern contains 4 columns.
After replacing each space in S with an asterisk, the string becomes "all*is*well" .
The last row of the pattern contains the first 4 characters of S from right to left.
* l l a
The last but one row of the pattern contains the first 4 characters of S from right to left.
w * s i
The last set of S contains 3 characters (ell), which is less than 4.
So a hash symbol # is filled in that position.
# l l e
Example Input/Output 2:
Input:
MAKE HAY WHILE THE SUN SHINES
12
Output:
# # # # # # # S E N I H
S * N U S * E H T * E L
I H W * Y A H * E K A M
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        int n=sc.nextInt();
        for(int i=0;i<s.length;i++){
            if(s[i]==' ')
                s[i]='*';
        }
        int l=0;
        if(s.length%n==0) l=s.length/n;
        else l=(s.length/n)+1;
        char a[][]=new char[l][n],k=0;
        for(int i=l-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(k==s.length)
                a[i][j]='#';
                else
                a[i][j]=s[k++];
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	}
}
