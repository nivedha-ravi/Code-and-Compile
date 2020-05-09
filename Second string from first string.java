/*
INPUT:
Flow
Wolf
OUTPUT:
yes
INPUT:
clOud
robOt
OUTPUT:
no
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String str1=in.nextLine();
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String s1=new String(ch);
		String s2=new String(ch1);
		if(s1.equals(s2))
		{
		    System.out.print("yes");
		}
		else
		{
		    System.out.print("no");
		}

	}
}
