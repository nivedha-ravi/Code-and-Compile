/*
 Example Input/Output 1:
 Input:
 4 7
 21 75 127 86
 Output:
 179
 Explanation:
 The binary representation of the 4 integers are 10101, 1001011, 1111111 and 1010110. After removing the first 7 zeroes in the cumulative binary representation of 4 integers, the integers become 7, 15, 127 and 30. So their sum 179 (7+15+127+30 = 179) is printed as the output.
 Example Input/Output 2:
 Input:
 5 5 5 6 8 10 12
 Output:
 29
 Explanation:
 The binary representation of the 5 integers are 101, 110, 1000, 1010 and 1100.
 After removing the first 5 zeroes in the cumulative binary representation of 5 integers, the integers become 3, 3, 1, 10 and 12. So their sum 29 (3+3+1+10+12 = 29) is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    String bin=Integer.toBinaryString(num);
		    String b="";
		    for(int j=0;j<bin.length();j++)
		    {
		        if(bin.charAt(j)=='1')
		        {
		            b+=bin.charAt(j);
		        }
		        else{
		            if(count<k)
		            {
		                count++;
		            }
		            else
		            {
		                b+=bin.charAt(j);
		            }
		        }
		    }
		    sum+=Integer.parseInt(b,2);

		}
		System.out.print(sum);
	}
}
