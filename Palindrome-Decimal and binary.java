/*
INPUT:
575
OUTPUT:
yes
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String st=Integer.toString(n);
		String s=Integer.toBinaryString(n);
		if(st.equals(new StringBuilder(st).reverse().toString()) && s.equals(new StringBuilder(s).reverse().toString()))
		{
		    System.out.print("yes");
		}
		else
		{
		    System.out.print("no");
		}

	}
}
