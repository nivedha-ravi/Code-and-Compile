/*
INPUT:
7
OUTPUT:
& & & & & & &
& * * * * * &
& * . . . * &
& * . . . * &
& * . . . * &
& * * * * * &
& & & & & & &
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0 || i==n-1 || j==0 || j==n-1)
		        {
		            System.out.print("& ");
		        }
		        else if(i==1 || j==1 || j==n-2 || i==n-2)
		        {
		            System.out.print("* ");
		        }
		        else
		        {
		            System.out.print(". ");
		        }
		    }
		    System.out.println();
		}

	}
}
