/*
INPUT:
6
65 2 78 790 10 31
OUTPUT:
31 790 78 10 65 2
INPUT:
5
9 15 6 4 14
OUTPUT:
15 14 6 9 4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    int a[]=new int[n];
	    int[] one=new int[n];
		for(int i=0;i<n;i++)
		{
		   a[i]=in.nextInt();
		   String s=Integer.toBinaryString(a[i]);
		   int count=0;
		   for(int j=0;j<s.length();j++)
		   {
		       if(s.charAt(j)=='1')
		       {
		           count++;
		       }
		   }
		   one[i]=count;
		}
		for(int i=0;i<n;i++)
		{
		   for(int j=i+1;j<n;j++)
		   {
		       if(one[i]<one[j])
		       {
		           int temp=one[i];
		           one[i]=one[j];
		           one[j]=temp;
		           int temp1=a[i];
		           a[i]=a[j];
		           a[j]=temp1;
		       }
		       else if(one[i]==one[j])
		       {
		           if(a[i]>a[j])
		           {
		               int temp=one[i];
		               one[i]=one[j];
		               one[j]=temp;
		               int temp1=a[i];
		               a[i]=a[j];
		               a[j]=temp1;
		           }
		       }
		   }
		   System.out.print(a[i]+" ");
		}

	}
}
