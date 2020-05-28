/*
INPUT:
3
4 1
24 32
24 36
OUTPUT:
Square
Rectangle
Square
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    int p=in.nextInt();
		    int a=in.nextInt();
		    int s=p/4;
		    if(s*s==a)
		    {
		        System.out.println("Square");
		    }
		    else
		    {
		        System.out.println("Rectangle");
		    }

		}

	}
}
