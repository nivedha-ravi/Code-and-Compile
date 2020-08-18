/*
Example Input/Output 1:
Input:
5 1
Output:
+-----+
|*****|
|*****|
|*****|
|*****|
|*****|
+-----+
Explanation:
Here N = 5 and X = 1.
The square root of 1 is 1. So the size of the matrix is 1x1 and it contains a matrix of size 5*5 with asterisks. Hence the output is +-----+ |*****| |*****| |*****| |*****| |*****| +-----+
Example Input/Output 2:
Input:
2 4
Output:
+--+--+
|**|**|
|**|**|
+--+--+
|**|**|
|**|**|
+--+--+
*/
import java.util.*;
public class Hello {
    public static void printOperators(int c,int n)
    {
        System.out.print("+");
        for(int i=0;i<c;i++)
        {
            System.out.print("-");
            if((i+1)%n==0)
            {
                System.out.print("+");
            }
        }
        System.out.println();
    }
    public static void printAsterik(int c,int n)
    {
        System.out.print("|");
        for(int i=0;i<c;i++)
        {
            System.out.print("*");
            if((i+1)%n==0)
            {
                System.out.print("|");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		int s=(int)Math.sqrt(x);
		printOperators(n*s,n);
		for(int i=0;i<n*s;i++)
		{
		    printAsterik(n*s,n);
		    if((i+1)%n==0)
		    {
		        printOperators(n*s,n);
		    }
		}

	}
}
