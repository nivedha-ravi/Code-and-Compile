/*
Input:
5
10 20 30 30 40
Output:
4
Explanation:
The distinct integers are 10 20 30 and 40. So their count 4 is printed as the output
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=1;
		int prev=in.nextInt();
		for(int i=1;i<n;i++)
		{
		    int curr=in.nextInt();
		    if(prev!=curr)
		    {
		        count++;
		    }
		    prev=curr;
		}
		System.out.print(count);

	}
}
