/*
INPUT:
6 4
87 94 91 79 87 87
OUTPUT:
79
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] st=str.split(" ");
		int n=Integer.parseInt(st[0]);
		int k=Integer.parseInt(st[1]);
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            a[j]='\0';
		        }
		    }
		}
		Arrays.sort(a);
		System.out.print(a[n-k-1]);

	}
}
