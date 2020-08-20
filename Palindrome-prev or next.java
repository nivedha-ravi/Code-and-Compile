/*
Example Input/Output 1:
Input:
afdc
Output:
YES
Explanation: Here the string is afdc. The first alphabet 'a' is replaced with 'b'. The second alphabet 'f' can be replaced with either 'e' or 'g'. To get the palindromic string, it must be replaced with 'e'. The third alphabet 'd' can be replaced with either 'c' or 'e'. To get the palindromic string, it must be replaced with 'e'. The fourth alphabet 'c' can be replaced with 'b' or 'd'. To get the palindromic string, it must be replaced with 'b'. Now the string becomes beeb which is a palindrome. So YES is printed as the output.
Example Input/Output 2:
Input:
bdhajzicb
Output:
NO
Example Input/Output 3:
Input:
azAZGuwEYByb
Output:
YES
*/
import java.util.*;
public class Hello {


    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] a=in.next().toCharArray();
		int len=a.length;
		for(int i=0,j=len-1;i<j;i++,j--)
		{
		   char f=a[i];
		   char l=a[j];
		   if(f==l||f==l+1||f==l-1||f+1==l+1||f-1==l-1||f+1==l-1||f-1==l+1||l==f+1||l==f-1)
		   {
		       continue;
		   }
		   else
		   {
		       System.out.print("NO");
		       return;
		   }
		}
		System.out.print("YES");
	}
}
