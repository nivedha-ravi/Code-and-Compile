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
		for(int i=0;i<n-1;i++)
		{
		    if((a[i]%2==0 && a[i+1]%2==0)||(a[i]%2==1 && a[i+1]%2==1))
		    {
		        System.out.print("no");
		        System.exit(1);
		    }
		}
		System.out.print("yes");

	}
}
