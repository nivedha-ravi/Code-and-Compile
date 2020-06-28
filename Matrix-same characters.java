/*
Example Input/Output 1:
Input:
5
z a a a z
a z a z a
a a z a a
a z a z a
z a a a z
Output:
YES
Explanation:
All the characters in the diagonals (both top-left to bottom-right diagonal and top-right to bottom-left diagonal) are highlighted below. z a a a z a z a z a a a z a a a z a z a z a a a z Here all the characters in the diagonals are same and all the characters in the non-diagonals are same. Hence the output is YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char a[][]=new char[n][n];
		Set<Character> s=new HashSet<Character>();
		Set<Character> sb=new HashSet<Character>();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=in.next().charAt(0);
		        if(i==j||j==n-i-1)
		        {
		            s.add(a[i][j]);
		        }
		        else
		        {
		            sb.add(a[i][j]);
		        }
		    }
		}
		System.out.print((s.size()==1 && sb.size()==1)?"YES":"NO");


	}
}
