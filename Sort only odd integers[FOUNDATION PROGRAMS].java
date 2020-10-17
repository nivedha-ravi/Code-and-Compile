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
		    if(a[i]%2!=0)
		    {
          
		        for(int j=i+1;j<n;j++)
		        {
		            if(a[j]<a[i] && a[j]%2!=0)
		            {
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		            }
		        }
		    }
		    System.out.print(a[i]+" ");
		}

	}
}
