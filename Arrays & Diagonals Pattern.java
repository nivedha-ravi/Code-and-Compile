/*
Input:
5
125 5 10 788 99
Output:
125******99
***5**788**
****10*****
***5**788**
125******99
 Explanation:
 Here N = 5. The generated matrix with the 5 integers is given below.
 125 5 10 788 99
 125 5 10 788 99
 125 5 10 788 99
 125 5 10 788 99
 125 5 10 788 99
 After replacing each digit with an asterisk in the non-diagonal integers of the matrix, it becomes
 125 * ** *** 99
 *** 5 ** 788 **
 *** * 10 *** **
 *** 5 ** 788 **
 125 * ** *** 99
 Finally, the matrix is printed with no space in each row.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();

		}
		for(int i=0;i<n;i++)
		{   int k=0;
		    for(int j=0;j<n;j++)
		    {
		        b[i][j]=a[k++];
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==j||j==n-i-1)
		        {
		            System.out.print(b[i][j]);
		        }
		        else
		        {
		            String s=Integer.toString(b[i][j]);
		            int len=s.length();
		            for(int k=0;k<len;k++)
		            {
		                System.out.print("*");
		            }

		        }
		    }
		    System.out.println();
		}

	}
}
