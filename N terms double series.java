/*
Example Input/Output 1:
Input: 10 2 5
Output:
3 6 3 9 7 16 7 19 11 26
Explanation:
Here N = 10, X = 2 and Y = 5.
The first 10 terms in the given series are 3(2+1), 6(5+1), 3(2*2-1), 9(2*5-1), 7(3*2+1), 16(3*5+1), 7(4*2-1), 19(4*5-1), 11(5*2+1) and 26(5*5+1).
Hence the output is 3 6 3 9 7 16 7 19 11 26
Example Input/Output 2:
Input: 15 9 1
Output:
10 2 17 1 28 4 35 3 46 6 53 5 64 8 71
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		int c=1,d=1;
		for(int i=1;i<=n;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.print(c*x+d+" ");
		    }
		    else
		    {
		        System.out.print(c*y+d+" ");
		        c++;
		        d*=-1;
		    }
		}

	}
}
