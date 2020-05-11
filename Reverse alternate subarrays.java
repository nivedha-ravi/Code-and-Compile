/*
INPUT:
8
2 9 8 3 5 3 8 1
2
OUTPUT:
9 2 8 3 3 5 8 1
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
		int l,r;
		for(int i=0;i<n;i++)
		{

		    l=i;
		    r=i+k-1;
		    if(r>=n)
		    {
		        r=n-1;
		    }
		    int s=r;
		    while(l<r)
		    {
		        int temp=a[l];
		        a[l]=a[r];
		        a[r]=temp;
		        l++;
		        r--;
		    }
		    i=s+k;
	}
	for(int i=0;i<n;i++)
	{
	    System.out.print(a[i]+" ");
	}
}
}
