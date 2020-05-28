*/
A shop to increase sales during a festival has an offer that a customer will get a discount if the customer buys shirts having same size in pairs. Any customer who buys will choose N shirts and the size of the shirt is denoted by S(i) where 1 <= i <=N. Two shirts S(i) and S(j) are matching and form a pair only if S(i) = S(j).
The program must print the number of pairs eligible for the discount.
Input Format:
The first line will contain the value of N The second line will contain the the size of N shirts S(1) to S(N) with each size separated by a space.
Output Format:
The first line will contain the number of matching pairs eligible for the discount.
Constraints:
2 <= N <= 100
Example Input/Output 1:
Input:
9
10 20 20 10 10 30 44 10 20
Output:
3
Explanation:
The matching pairs are (10,10) (20,20) (10,10).
Example Input/Output 2:
Input:
6
42 44 40 42 44 42
Output:
2
Explanation:
The matching pairs are (42,42) (44,44)
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int numcount[]=new int[1000];
		int count=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    numcount[a[i]]++;
		}
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
		    s.add(a[i]);
		}
		for(int i:s)
		{
		    int c=numcount[i];
		    count+=(c/2);
		}

		System.out.print(count);

	}
}
