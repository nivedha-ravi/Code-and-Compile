/*
The program must accept four integers X, Y, M and N as the input.
The program must print all the terms from Mth term to Nth term in the mixture of two series given below.
The series is X, Y, 2X, 2Y, 3X, 3Y, 4X, 4Y, 5X, 5Y, 6X, 6Y, 7X, 7Y .......
Note:
All the odd terms in the above series form multiples of X in ascending order.
All the even terms in the above series form multiples of Y in ascending order.
Boundary Condition(s):
1 <= X, Y <= 10^4 1 <= M < N <= 10^8
Input Format:
The first line contains the values of X, Y, M and N separated by a space.
Output Format:
The first line contains all the terms from Mth term to Nth term in the mixture of two series as per the given conditions.
Example Input/Output 1:
Input:
2 5 3 8
Output:
4 10 6 15 8 20
Explanation:
The series is 2 5 4 10 6 15 8 20 10 25 12 30..... So all the terms from the 3rd term to the 8th term are printed.
Hence the output is 4 10 6 15 8 20
Example Input/Output 2:
Input:
1 10 1 10
Output:
1 10 2 20 3 30 4 40 5 50
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long x=in.nextLong();
		long y=in.nextLong();
		long m=in.nextLong();
		long n=in.nextLong();
		long count=(m%2==0)?m/2:(m+1)/2;
		for(long i=m;i<=n;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.print(x*count+" ");
		    }
		    else
		    {
		        System.out.print(y*count+" ");
		        count++;
		    }
		}

	}
}
