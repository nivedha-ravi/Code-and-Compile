/*
Input:
91 43
Output:
5
Explanation:
The binary representation of 91 is 1011011.
The binary representation of 43 is 101011.
The position of the rightmost bit that differs in their binary representation is 5.
The 5th bit from the right side of 1011011 is 1. The 5th bit from the right side of 101011 is 0.
Hence the output is 5
Example Input/Output 2:
Input:
32 64
Output:
6
Example Input/Output 3:
Input:
344 24
Output:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		String s=Integer.toBinaryString(x);
		String s1=Integer.toBinaryString(y);
		int l1=s.length(),l2=s1.length();
		int count=0;
		for(int i=l1-1,j=l2-1;i>=0 && j>=0;i--,j--)
		{
		    count++;
		    if(s.charAt(i)!=s1.charAt(j))
		    {
		        System.out.print(count);
		        System.exit(1);
		    }
		}
		System.out.print("-1");

	}
}
