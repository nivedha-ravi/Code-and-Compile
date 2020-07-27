/*
Example Input/Output 1:
Input:
3 3
1 2 3
4 5 6
7 8 9
D
Output:
7 8 9
7 8 9
7 8 9
Explanation: Here CH = D. So each row is replaced with the last row in the matrix. Hence the output is 7 8 9 7 8 9 7 8 9
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int r=in.nextInt();
	    int c=in.nextInt();
	    int a[][]=new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            a[i][j]=in.nextInt();
	        }
	    }
	    char ch=in.next().charAt(0);
	    if(ch=='D' || ch=='d')
	    {
	        for(int i=0;i<r;i++)
	        {
	            for(int j=0;j<c;j++)
	            {
	                System.out.print(a[r-1][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    else if(ch=='U' || ch=='u')
	    {
	        for(int i=0;i<r;i++)
	        {
	            for(int j=0;j<c;j++)
	            {
	                System.out.print(a[0][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    else if(ch=='r'||ch=='R')
	    {
	        int k=0;
	        for(int i=0;i<r;i++)
	        {

	            for(int j=0;j<c;j++)
	            {
	                System.out.print(a[k][c-1]+" ");
	            }
	            k++;
	            System.out.println();
	        }
	    }
	    else if(ch=='L'||ch=='l')
	    {
	        int k=0;
	        for(int i=0;i<r;i++)
	        {

	            for(int j=0;j<c;j++)
	            {
	                System.out.print(a[k][0]+" ");
	            }
	            k++;
	            System.out.println();
	        }
	    }
	    else{
	        for(int i=0;i<r;i++)
	        {
	            for(int j=0;j<c;j++)
	            {
	                System.out.print(a[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }

	}
}
