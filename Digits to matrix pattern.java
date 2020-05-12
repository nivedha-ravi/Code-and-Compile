/*
INPUT:
2987
OUTPUT:
22998877
22998877
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch[]=s.toCharArray();
		int n=Character.getNumericValue(ch[0]);
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<ch.length();j++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            System.out.print(ch[j]);
		        }
		    }
		    System.out.println();
		}

	}
}
