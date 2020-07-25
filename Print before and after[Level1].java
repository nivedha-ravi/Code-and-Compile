/*
INPUT:
between w
OUTPUT:
beteen
INPUT:
missing s
OUTPUT:
miing
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
		if(s1.charAt(0)==ch && s1.charAt(len-1)==ch)
		{
		    System.out.print("-1");
		}
		else
		{
		    for(int i=0;i<first;i++)
		    {

		        System.out.print(s1.charAt(i));

		    }
		    for(int i=last+1;i<len;i++)
		    {
		        System.out.print(s1.charAt(i));
		    }
		}


	}
}
