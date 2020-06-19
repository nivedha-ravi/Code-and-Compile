/*
INPUT:
17593
OUTPUT:
0
INPUT:
500420
OUTPUT:
420
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int len=s.length(),k=0;
		for(int i=0;i<len;i++)
		{
		    int t=s.charAt(i)-'0';
		    if(t==0)
		    {
		        if(k==0)
		        {
		        continue;
		        }
		    }
		    if(t%2==0)
		    {
		        k=1;
		        System.out.print(t);
		    }

		}
		if(k==0)
		{
		    System.out.print(k);
		}
	}
}
