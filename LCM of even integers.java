/*
Example Input/Output 1:
Input:
 5
 2 5 3 6 4
 Output:
 12
 Explanation: The even integers among the 5 integers are 2, 6 and 4. The LCM of 2, 6 and 4 is 12. So 12 is printed as the output.
Example Input/Output 2:
Input:
5
10 21 14 89 2
Output:
70
*/
import java.util.*;
public class Hello {
    public static long findLCM(long a,long b)
    {
        return (a*b)/(findHCF(a,b));
    }
    public static long findHCF(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return findHCF(b,a%b);
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long a[]=new long[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
		    long num=in.nextLong();
		    if(num%2==0)
		    {
		    a[k++]=num;
		    }
		}
		long lcm1=a[0];
		for(int i=1;i<k;i++)
		{
		    lcm1=findLCM(lcm1,a[i]);
		}
		System.out.print(lcm1);

	}
}
