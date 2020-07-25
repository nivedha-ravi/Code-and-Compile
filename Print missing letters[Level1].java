/*
INPUT:
debugger@b
buggdeb
OUTPUT:
er@
INPUT:
compiabcdz#uz
dzabcoip#
OUTPUT:
mcuz
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int l1=ch1.length,l2=ch2.length;
		for(int i=0;i<l1;i++)
		{
		    for(int j=0;j<l2;j++)
		    {
		        if(ch1[i]==ch2[j])
		        {
		            ch1[i]='~';
		            ch2[j]='~';
		            break;
		        }
		    }
		}
		for(int i=0;i<l1;i++)
		{
		    if(ch1[i]!='~')
		    {
		        System.out.print(ch1[i]);
		    }
		}
	}
}
