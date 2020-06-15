/*
INPUT:
10
24 32 10 43 82 51 62 70 92 23
OUTPUT:
282 192 32 284 469 253 404 304 444 228
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    int sum=0,l,m;
		    int last=a[i]%10;
		    String s=Integer.toString(a[i]);
		    int first=Character.getNumericValue(s.charAt(0));
		    if(i==n-1)
		    {
		        l=0;
		    }
		    else
		    {
		    l=i+1;
		    }
		    for(int j=0;j<last;j++)
		    {
		        sum+=a[l++];
		        if(l==n)
		        {
		            l=0;
		        }
		    }
		    if(i==0)
		    {
		        m=n-1;
		    }
		    else
		    {
		        m=i-1;
		    }
		    for(int k=0;k<first;k++)
		    {
		        sum+=a[m--];
		        if(m==-1)
		        {
		            m=n-1;
		        }
		    }
		    System.out.print(sum+" ");
		}

	}
}
