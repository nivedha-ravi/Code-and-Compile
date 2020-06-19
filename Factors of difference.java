/*
INPUT:
34 12
OUTPUT:
1 2 11 22
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n1=in.nextLong();
		long n2=in.nextLong();
		long n3=Math.abs(n1-n2);
		for(long i=1L;i<=n3;i++)
		{
		    if(n3%i==0L)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
