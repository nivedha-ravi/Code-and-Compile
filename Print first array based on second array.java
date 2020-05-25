/*
INPUT:
15 4
50 10 2 5 7 10 1 9 3 6 8 8 10 10 50
50 10 8 9
OUTPUT:
50 50 10 10 10 10 8 8 9 7 6 5 3 2 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		for(int i=0;i<m;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    b[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        if(b[i]==a[j])
		        {
		            System.out.print(a[j]+" ");
		            a[j]=0;
		        }
		    }
		}
		Arrays.sort(a);
		for(int i=m-1;i>=0;i--)
		{
		    if(a[i]!=0)
		    System.out.print(a[i]+" ");
		}

	}
}
