/*
INPUT:
abcdefgdcba
OUTPUT:
efg
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    int len=str.length();
	    int i=0,j=len-1;
	    while(i<j && str.charAt(i)==str.charAt(j))
	    {
	        i++;
	        j--;
	    }
	    if(i>=j)
	    {
	        System.out.print("-1");
	    }
	    else
	    {
	        System.out.print(str.substring(i,j+1));
	    }


	}
}
