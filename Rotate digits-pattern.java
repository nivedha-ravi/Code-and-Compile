/*
INPUT:
241
OUTPUT:
22-4444-11
2222-4-11
2-44-1111
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=Integer.toString(n);
		int c=s.length();
		for(int i=0;i<c;i++)
		{   int m=0,count=0;
		    for(int j=i;j<i+c;j++)
		    {
		        int digit=s.charAt(j%c)-'0';
		        count++;
		        for(int k=0;k<digit;k++)
		        {
		            System.out.print(s.charAt(m));
		        }
		        if(count!=c)
		        {
		            System.out.print("-");
		        }
		        if(count==c)
		        {
		            break;
		        }
		        m++;
		    }
		    System.out.println();
		}

	}
}
