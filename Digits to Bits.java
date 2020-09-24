/*
Example Input/Output 1:
Input:
84536
Output:
6
Explanation:
Here N = 84536. After replacing each odd digit in 84536 with 1, the integer becomes 84116.
After replacing each even digit in 84116 with 0, the integer becomes 00110. Now the decimal equivalent of 00110 is 6. So 6 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		char[] s=Long.toString(n).toCharArray();
		for(int i=0;i<s.length;i++)
		{
		    if((s[i]-'0')%2!=0)
		    {
		        s[i]='1';
		    }
		    else
		    {
		        s[i]='0';
		    }
		}
		String str=new String(s);
		System.out.print(Long.parseLong(str,2));
	}
}
