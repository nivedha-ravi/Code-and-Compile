/*
Example Input/Output 1:
Input:
107812 154
Output:
1078
Explanation: The longest prefix in 107812 which is divisible by 154 is 1078. So 1078 is printed as the output.
Example Input/Output 2:
Input:
1573 4
Output:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int k=in.nextInt();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
		    int num=Integer.parseInt(s.substring(0,i+1));
		    if(num%k==0)
		    {
		        System.out.print(num);
		        return;
		    }
		}
		System.out.print("-1");

	}
}
