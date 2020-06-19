/*
INPUT:
2345678
OUTPUT:
427161253634364
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
		    int n=Character.getNumericValue(s.charAt(i));
		    System.out.print((n%2==0)?(int)Math.pow(n,2):(int)Math.pow(n,3));
		}
	}
}
