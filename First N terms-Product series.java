/*
INPUT:
2
OUTPUT:
6 120
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long k=1L;
		for(int i=1;i<=n;i++)
		{
		    long fact=k*(k+1)*(k+2);
		    System.out.print(fact+" ");
		    k=k+3;
		}

	}
}
