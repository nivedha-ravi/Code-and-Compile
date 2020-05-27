/*
The program must accept an integer N in the form of string as the input.
The program must extract out digits at even positions, square & merge them. First 4 digits of the result will be the required OTP.
Finally, the program must print the 4-digit OTP as the output.
If it is not possible to such an OTP, the program must print -1 as the output.
Boundary Condition(s):
1 <= N <= 10^8
Input Format:
The first line contains N.
Output Format:
The first line contains the first 4-digit OTP or -1.
Example Input/Output 1:
Input:
345675
Output:
1636
Explanation:
The squares of the digits present in the even positions of the integer 345675 are 16, 36 and 25.
So after concatenating the squares 16, 36 and 25, 163625 is formed. Hence the output is 1636
Example Input/Output 2:
Input:
456213
Output:
2549
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char s[]=str.toCharArray();
		String st=" ";
		for(int i=0;i<s.length;i++)
		{
		    if(i%2!=0)
		    {
		        int n=s[i]-'0';
		        int sq=n*n;
		        st+=Integer.toString(sq);
		    }
		}
		if(st.length()>=4)
		{
		    System.out.print(st.substring(0,5));
		}
		else
		{
		    System.out.print("-1");
		}

	}
}
