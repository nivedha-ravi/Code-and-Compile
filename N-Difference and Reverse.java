/*
INPUT:
1594
OUTPUT:
3357
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=Integer.parseInt(s);
		StringBuilder sb=new StringBuilder(s);
		String st=sb.reverse().toString();
		int rev=Integer.parseInt(st);
		System.out.print(Math.abs(n-rev));
	}
}
