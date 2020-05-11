/*
INPUT:
154
OUTPUT:
190
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long count=0L;
		long temp=n;
		while(n!=0L)
		{
		    ++count;
		    n/=10L;
		}
		long sum=0L;
		while(temp>0L)
		{
		    long unit=temp%10;
		    sum=sum+(long)Math.pow(unit,count);
		    temp=temp/10;
		}
		System.out.print(sum);

	}
}
