/*
INPUT:
9
39 23 19 27 41 55 69 88 97
4
OUTPUT:
YES
INPUT:
5
25 39 41 85 27
3
OUTPUT:
NO
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
		for(int i=0;i<k;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(a[i]>a[j])
		        {
		        int temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		        }
		    }
		}
		int as=1,j=0;
		while(as==1 && j<n-1)
		{
		    if(a[j]>a[j+1])
		    {
		        as=0;
		    }
		    j++;
		}
		if(as==1)
		{
		    System.out.print("YES");
		}
		else
		{
		    System.out.print("NO");
		}

	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    b[i]=a[i];
		}
		Arrays.sort(b);
		int k=in.nextInt();
		for(int i=0;i<k-1;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(a[j]<a[i])
		        {
		        int temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(a[i]!=b[i])
		    {
		        System.out.print("NO");
		        System.exit(1);
		    }
		}
		System.out.print("YES");

	}
}
