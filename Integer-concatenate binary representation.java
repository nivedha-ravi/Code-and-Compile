/*
Input:
10 6
Output:
27
Explanation:
The binary representation of 10 is 1010. The binary representation of 6 is 110. After concatenating the bits from the binary representations of 10 and 6 alternatively in reverse order, the binary representation B becomes 0011011. The decimal equivalent of 0011011 is 27, so 27 is printed as the output
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		String b1=Integer.toBinaryString(x);
		String b2=Integer.toBinaryString(y);
		String b="";
	    int printed=1;
	    int bl1=b1.length();
	    int bl2=b2.length();
	    int len=bl1+bl2;
	    int i=bl1-1,j=bl2-1;
	    while(printed<=len)
	    {
	        if(i>=0)
	        {
	            b+=b1.charAt(i);
	            i--;
	            printed++;
	        }
	        if(j>=0)
	        {
	            b+=b2.charAt(j);
	            j--;
	            printed++;
	        }

	    }
	    System.out.print(Long.parseLong(b,2));

	}
}
