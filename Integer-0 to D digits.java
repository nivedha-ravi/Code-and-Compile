/*
INPUT:
102435 4
OUTPUT:
yes
INPUT:
21342
OUTPUT:
no
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    long n=in.nextLong();
	    int d=in.nextInt();
	    String str=Long.toString(n);
	    char[] ch=str.toCharArray();
	    Arrays.sort(ch);
	    int count=0;
	    for(int i=0;i<=d;i++)
	    {
	        for(int j=0;j<ch.length;j++)
	        {
	            if(Character.getNumericValue(ch[j])==i)
	            {
	                count++;
	                break;
	            }
	        }
	    }
	    if(count==d+1)
	    {
	        System.out.print("yes");
	    }
	    else
	    {
	        System.out.print("no");
	    }

	}
}
