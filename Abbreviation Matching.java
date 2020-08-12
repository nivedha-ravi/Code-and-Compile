/*
INPUT:
4
hello Good Morning
World Health Organisation
World Human Chain
World War Two
WHO
OUTPUT:
World Health Organisation
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    in.nextLine();
	    String[] ss=new String[n];
	    for(int i=0;i<n;i++)
	    {
	        ss[i]=in.nextLine();
	    }
	    String k=in.nextLine();
	    for(int i=0;i<n;i++)
	    {
	        String ans="";
	        String kk[]=ss[i].split(" ");
	        for(String m:kk)
	        {
	            ans+=m.charAt(0)+"";
	        }
	        if(k.equalsIgnoreCase(ans))
	        {
	            System.out.print(ss[i]);
	        }
	    }



	}
}
