/*
INPUT:
5
80 82 26 -27 25
OUTPUT:
80 26 -27
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int count=-1;
		for(int i=0;i<n;i++)
		{
		    arr[i]=in.nextInt();
		    if((i+1)%2==1)
		    {
		        if(arr[i]%2==0)
		        {
		            System.out.print(arr[i]+" ");
		            count=1;
		        }
		    }
		    else
		    {
		        if(arr[i]%2!=0)
		        {
		            System.out.print(arr[i]+" ");
		            count=1;
		        }
		    }
		}
		if(count==-1)
		{
		    System.out.print(count);
		}

	}
}
