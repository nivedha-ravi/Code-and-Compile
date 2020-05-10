/*
INPUT:
10 500
OUTPUT:
25 49 121 169 289 361
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String st[]=str.split(" ");
		long m=Long.parseLong(st[0]);
		long n=Long.parseLong(st[1]);
		int flag=0;
		for(long i=m;i<=n;i++)
		{
		    long num=(long)Math.sqrt(i);
		    if(num*num!=i||i==1)
		    {
		        continue;
		    }
		    int k=0;
		    for(long j=2;j<=num/2;j++)
		    {
		        if(num%j==0)
		        {
		            k=1;
		            break;
		        }
		    }
		    if(k==0)
		    {
		        System.out.print(num*num+" ");
		        flag=1;
		    }
		}
        if(flag==0)
        {
            System.out.print("-1");
        }
	}
}
