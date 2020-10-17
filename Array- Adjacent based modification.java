/*
The program must accept N integers as the input. For each integer X among the N integers, the program must increment the value of X by 1 only if at least one of the adjacent integers is odd. Then the program must print the N modified integer values as the output.
Input:
5
1 3 6 4 8
Output:
2 4 7 4 8
Explanation:
The first integer is 1 which has an odd integer on its right(3). So it is incremented by 1.
The second integer is 3 which has an odd integer on its left(1). So it is incremented by 1.
The third integer is 6 which has an odd integer on its left(3). So it is incremented by 1.
The fourth integer is 4 which has no odd integer on its left and right. So it remains the same.
The fifth integer is 8 which has no odd integer on its left and right. So it remains the same.
Hence the output is 2 4 7 4 8
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
		int prev=a[0];
		if(a[1]%2!=0)
		{
		    a[0]++;
		}
		for(int i=1;i<n-1;i++)
		{
		    if(prev%2!=0|| a[i+1]%2!=0)
		    {
		        prev=a[i];
		        a[i]++;
		    }
		    else
		    {
		        prev=a[i];
		    }
		}
		if(prev%2!=0)
		{
		    a[n-1]++;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}

	}
}
