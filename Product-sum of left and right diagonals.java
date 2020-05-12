/*
Input:
4
6 7 9 2
2 4 4 1
9 3 9 1
1 3 9 9
Output:
280
Explanation:
The sum of integers in the left diagonal is 28 (6 + 4 + 9 + 9).
The sum of integers in the right diagonal is 10 (2 + 4 + 3 +1). So the product of 28 and 10 is 280. Hence the output is 280
Example Input/Output 2:
Input:
3
1 2 3
4 5 6
7 8 9
Output:
225
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==j)
		        {
		            sum1+=a[i][j];
		        }
		        if(j==n-i-1)
		        {
		            sum2+=a[i][j];
		        }
		    }
		}
		System.out.print(sum1*sum2);

	}
}
