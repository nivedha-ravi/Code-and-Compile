/*
Example Input/Output 1:
Input:
7 3
3 4 6 2 7 1 9
2 1 6
Output:
6 2 1
Explanation:
The products available in the supermarket are given below.
3 4 6 2 7 1 9
The boy wants to purchase 3 products that are given below. 2 1 6 Here all three products are available for the boy from the supermarket.
So they are printed in the order of their occurrence. Hence the output is 6 2 1
Example Input/Output 2:
Input:
5 5
5 4 3 7 10
7 3 6 9 10
Output:
3 7 10
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int a[]=new int[x];
		int b[]=new int[y];
		for(int i=0;i<x;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int j=0;j<y;j++)
		{
		    b[j]=in.nextInt();
		}
		int index[]=new int[y];
		int k=0;
		for(int i=0;i<y;i++)
		{
		    for(int j=0;j<x;j++)
		    {
		        if(b[i]==a[j])
		        {
		            index[k++]=j;
		            break;
		        }
		    }
		}
		for(int i=0;i<k;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(index[i]>index[j])
		        {
		            int temp=index[i];
		            index[i]=index[j];
		            index[j]=temp;
		        }
		    }
		}
		for(int i=0;i<k;i++)
		{
		    System.out.print(a[index[i]]+" ");
		}

	}
}
