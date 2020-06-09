/*
INPUT:
100 300 25
OUTPUT:
12
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long first=in.nextLong();
		long last=in.nextLong();
		String d=in.next();
		int count=0;
		for(long i=first;i<=last;i++)
		{
		    String num=String.valueOf(i);
		    if(num.contains(d))
		    {
		        count++;
		    }
		}
		System.out.print(count);

	}
}
