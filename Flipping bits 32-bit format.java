/*
Example Input/Output 1:
Input:
2
399861 7
Output:
4294567434
4294967288
Explanation:
The binary representation of 399861 in 32 bits is 00000000000001100001100111110101.
After toggling the bits, it becomes 11111111111110011110011000001010.
The decimal equivalent of the above binary representation is 4294567434. So it is printed.
The binary representation of 7 in 32 bits is 00000000000000000000000000000111.
After toggling the bits, it becomes 11111111111111111111111111111000.
The decimal equivalent of the above binary representation is 4294967288. So it is printed.
Example Input/Output 2:
Input:
3
52568330 45 82730988
Output:
4242398965
4294967250
4212236307
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=0;i<N;i++)
    {
        long num=sc.nextLong();
        String s=Long.toBinaryString(num);
        String ans="";
        if(s.length()<32)
        {
            int gap=32-s.length();
            while(gap>0)
            {
                ans+='1';
                gap--;
            }
        }
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='1')
            ans+='0';
            else
            ans+='1';
        }
        long ansnum=Long.parseLong(ans,2);
        System.out.println(ansnum);
    }
	}
}
