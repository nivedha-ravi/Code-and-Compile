/*
INPUT:
he is a good boy
OUTPUT:
+--+--+-+----+---+
|he|is|a|good|boy|
+--+--+-+----+---+
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] str=s.split(" ");
		int a[]=new int[str.length];
		int n=str.length;
		for(int i=0;i<n;i++)
		{
		    a[i]=str[i].length();
		}
		int t=a.length;

		    for(int j=0;j<a.length;j++)
		    {   System.out.print("+");
		        for(int k=0;k<a[j];k++)
		        {
		            System.out.print("-");
		        }
		        if(j==t-1)
		        {
		            System.out.print("+\n");
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print("|");
		        System.out.print(str[i]);
		        if(i==n-1)
		        {
		            System.out.print("|\n");
		        }
		    }
		    for(int j=0;j<a.length;j++)
		    {
		        System.out.print("+");
		        for(int k=0;k<a[j];k++)
		        {
		            System.out.print("-");
		        }
		        if(j==t-1)
		        {
		            System.out.print("+");
		        }
		    }


	}
}
