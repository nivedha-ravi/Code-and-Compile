/*
INPUT:
9
27 25 88 90 58 59 21 34 55
6
OUTPUT:
59 58 90 55 34 21 27 25 88
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
		int k=in.nextInt();
		for(int i=0,j=k-1;i<j;i++,j--)
		{
		    int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		}
		for(int i=n-k,j=n-1;i<j;i++,j--)
		{
		    int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
