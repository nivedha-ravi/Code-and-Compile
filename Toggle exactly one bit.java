/*
Example Input/Output 1:
Input:
22
Output:
30
Explanation: The binary representation of 22 is 10110.
If the first bit is toggled, the binary representation becomes 00110 and its decimal equivalent is 6. If the second bit is toggled, the binary representation becomes 11110 and its decimal equivalent is 30. If the third bit is toggled, the binary representation becomes 10010 and its decimal equivalent is 18. If the fourth bit is toggled, the binary representation becomes 10100 and its decimal equivalent is 20. If the fifth bit is toggled, the binary representation becomes 10111 and its decimal equivalent is 23. Here the maximum integer value is 30. So it is printed as the output.
Example Input/Output 2:
Input:
15
Output:
15
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=Integer.toBinaryString(n);
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='0')
		    {
		        System.out.print(n+(1<<s.length()-i-1));
		        return;
		    }
		}
		System.out.print(n);



	}
}
