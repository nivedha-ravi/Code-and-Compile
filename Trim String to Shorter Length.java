/*
Example Input/Output 1:
Input:
skill rack
Output:
skil rack
Explanation:
The length of the string skill is 5.
The length of the string rack is 4.
Here the string rack is shorter, so the string skill is trimmed to the first 4 characters.
Hence the output is skil rack
Example Input/Output 2:
Input:
boy water
Output:
boy wat
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		if(s1.length()>s2.length())
		{
		    System.out.print(s1.substring(0,s2.length())+" "+s2);
		}
		else if(s2.length()>s1.length())
		{
		    System.out.print(s1+" "+s2.substring(0,s1.length()));
		}
		else
		{
		    System.out.print(s1+" "+s2);
		}

	}
}
