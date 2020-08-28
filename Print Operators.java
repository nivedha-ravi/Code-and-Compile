/*
Input:
6
2 50 7 5 1 15
10 5
Output:
/ * # - # +
Explanation:
The integer 2 is a result of 10/5. So '/' is printed. The integer 50 is a result of 10*5. So '*' is printed. The integer 7 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So '#' is printed. The integer 5 is a result of 10-5. So '-' is printed. The integer 1 is not a result of any operation of 10 and 5 (10/5, 10*5, 10+5, 10-5). So '#' is printed.
The integer 15 is a result of 10+5. So '+' is printed
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		int p=in.nextInt();
		int q=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    if((int)(p/q)==a[i])
		    {
		        System.out.print("/ ");
		    }
		    else if(p*q==a[i])
		    {
		        System.out.print("* ");
		    }
		    else if(p+q==a[i])
		    {
		        System.out.print("+ ");
		    }
		    else if(p-q==a[i])
		    {
		        System.out.print("- ");
		    }
		    else
		    {
		        System.out.print("# ");
		    }
		}

	}
}
