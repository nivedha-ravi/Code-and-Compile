/*
Example Input/Output 1:
Input:
1204571
Output:
5
Explanation:
Here N = 1204571. After removing all the digits except 0's and 1's in 1204571, the integer becomes 101.
The decimal equivalent of 101 is 5. Hence the output is 5
Example Input/Output 2:
Input:
487
Output:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String str="";
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='0' || s.charAt(i)=='1')
		    {
		        str+=s.charAt(i);
		    }
		}
		System.out.print((str!="")?Integer.parseInt(str,2):"-1");
	}
}
