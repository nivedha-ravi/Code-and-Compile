/*
Input:
6
27 68 12 39 74 75
Output:
3 1 4 2 5 6
Explanation:
The 6 integers are 27 68 12 39 74 75.
After sorting the integers in ascending order, the integers become 12 27 39 68 74 75.
The original position of the integer 12 is 3. So 3 is printed.
The original position of the integer 27 is 1. So 1 is printed.
The original position of the integer 39 is 4. So 4 is printed.
The original position of the integer 68 is 2. So 2 is printed.
The original position of the integer 74 is 5. So 5 is printed.
The original position of the integer 75 is 6. So 6 is printed.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int index[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    index[i]=i+1;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>a[j])
		        {
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		            int temp1=index[i];
		            index[i]=index[j];
		            index[j]=temp1;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(index[i]+" ");
		}

	}
}
