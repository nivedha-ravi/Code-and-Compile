/*
Example Input/Output 1:
Input: 5 29
5 10 12 4 15
Output: 3
Explanation:
The prices of the 5 ice creams are 5 10 12 4 15. T = 29.
The possible ways the boy can buy ice creams are given below.
5 10 12 (27 <= 29)
5 10 4 (19 <= 29)
5 12 4 (21 <= 29)
5 4 15 (24 <= 29)
10 12 4 (26 <= 29)
10 4 15 (29 <= 29)
The maximum number of ice creams that can be bought by the boy is 3.
So 3 is printed as the output.
Example Input/Output 2:
Input: 6 60
10 4 15 3 6 9
Output: 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int count=0,sum=0;
		for(int i=0;i<n;i++)
		{
		    if(sum<t)
		    {
		        sum+=a[i];
		    }
		    if(sum<=t)
		    {
		        count++;
		    }
		    else
		    {
		        break;
		    }
		}
		System.out.print(count);

	}
}
