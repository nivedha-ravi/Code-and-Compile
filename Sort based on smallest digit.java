/*
Input:
7
6844 25171 53677 18072 26457 70816 59225
Output:
70816 18072 25171 59225 26457 53677 6844
*/
import java.util.*;
public class Hello {
    public static int smallest(int n)
    {
        int small=n%10;
        while(n!=0)
        {
            if(n%10<small)
            {
                small=n%10;
            }
            n/=10;
        }
        return small;
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int small[]=new int[n];
		for(int i=0;i<n;i++)
		{
		   a[i]=in.nextInt();
		   small[i]=smallest(a[i]);
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(small[i]==small[j])
		        {
		            if(a[i]<a[j])
		            {
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		                int temp1=small[i];
		                small[i]=small[j];
		                small[j]=temp1;
		            }
		        }
		        else if(small[i]>small[j])
		        {
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		            int temp1=small[i];
		            small[i]=small[j];
		            small[j]=temp1;
		        }
		    }
		    System.out.print(a[i]+" ");
		}

	}
}
