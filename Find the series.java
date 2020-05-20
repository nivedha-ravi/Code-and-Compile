/*
The program must print the values of X and y(x>=y) 1 to x and 1 to y.
INPUT:
6
1 2 4 2 1 3
OUTPUT:
4 2
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
		int newArr[]=new int[n];
		int k=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            newArr[k++]=a[j];
		        }
		    }
		}
		System.out.print(a[n-1]+" "+newArr[k-1]);


	}
}
