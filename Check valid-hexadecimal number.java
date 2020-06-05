/*
INPUT:
7cD
OUTPUT:
yes
INPUT:
12h
OUTPUT:
no
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    if(!((ch[i]>='A' &&  ch[i]<='F')||(ch[i]>='a' && ch[i]<='f')||(ch[i]>='0' && ch[i]<='9')))
		    {
		        System.out.print("no");
		        System.exit(1);
		    }
	    }
	    System.out.print("yes");
    }
}
