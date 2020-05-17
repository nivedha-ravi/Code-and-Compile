/*
INPUT:
6
100 200 300 400 500 600
OUTPUT:
100 100 100 100 100 100
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
		    if(i!=0)
		    {
		        if(a[i]>a[i-1])
		        {
		            a[i]=a[i-1];
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
