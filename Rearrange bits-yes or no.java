/*
Example Input/Output 1:
Input:
10 12
Output:
YES
Explanation: The binary representation of 10 is 1010. The binary representation of 12 is 1100.
Here 1010 can be rearranged as 1100. So YES is printed as the output.
Example Input/Output 2:
Input:
10 3
Output:
YES
Explanation: The binary representation of 10 is 1010. The binary representation of 3 is 11. Here 1010 can be rearranged as 0011. Here both 0011 and 11 represent the decimal value 3. So YES is printed as the output.
Example Input/Output 3:
Input:
14 26
Output:
NO
Explanation: The binary representation of 14 is 1110. The binary representation of 26 is 11010. Here 1110 can not be rearranged as 11010. So NO is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		String x1=Integer.toBinaryString(x);
		String x2=Integer.toBinaryString(y);
		int zero=0,one=0,zero1=0,one1=0;
		for(int i=0;i<x1.length();i++)
		{
		    if(x1.charAt(i)=='0')
		    {
		        zero++;
		    }
		    else
		    {
		        one++;
		    }
		}
        for(int i=0;i<x2.length();i++)
        {
            if(x2.charAt(i)=='0')
            {
                zero1++;
            }
            else
            {
                one1++;
            }
        }
        if((one==one1 && zero1==zero) || (one1==one && zero1<zero))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
	}
}
