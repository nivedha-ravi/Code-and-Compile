/*
INPUT:
missiles s
OUTPUT:
sile
INPUT:
mettlesome e
OUTPUT:
ttlesom
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		char ch=in.next().charAt(0);
		int len=s1.length();
		int first=s1.indexOf(ch);
		int last=s1.lastIndexOf(ch);
		for(int i=first+1;i<last;i++)
		{
		  System.out.print(s1.charAt(i));

		}


	}
}
