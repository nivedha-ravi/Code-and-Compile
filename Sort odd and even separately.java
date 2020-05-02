/*
INPUT:
11
46 20 55 43 83 73 66 90 25 79 50
OUTPUT:
20 46 25 43 55 73 50 66 79 83 90
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
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]%2!=0 && a[j]%2!=0)
		        {
		            if(a[i]>a[j])
		            {
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]%2==0 && a[j]%2==0)
		        {
		            if(a[i]>a[j])
		            {
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
