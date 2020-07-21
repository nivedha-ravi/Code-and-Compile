/*
Input:
receiving
Output:
--------r
-------re
------rec
-----rece
----recei
---receiv
--receivi
-receivin
receiving
eceiving
ceiving
eiving
iving
ving
ing
ng
g
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length(),k=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n-k;j++)
		    {

		        System.out.print("-");
		    }
		    System.out.print(s.substring(0,k));
		    k++;
		    System.out.println();
		}
		k=1;
		for(int i=0;i<n;i++)
		{
		    System.out.print(s.substring(k,n));
		    k++;
		    if(i!=n-1)
		    {
		        System.out.println();
		    }
		}

	}
}
