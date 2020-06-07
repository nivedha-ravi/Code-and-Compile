/*
INPUT:
8
10 35 42 10 35 10 68 10
OUTPUT:
10 35 42 10 35 68
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
		{   int count=0;
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            count++;
		        }
		        if(a[i]==a[j] && count>1)
		        {
		            a[j]=-1;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(a[i]!=-1)
		    {
		        System.out.print(a[i]+" ");
		    }
		}
	}
}
