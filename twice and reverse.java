/*
Example Input/Output 1:
Input:
4 5
Output:
4 3 2 1
2 4 6 8
16 12 8
4 8 16 24
32 64 48 32 16
Explanation: Here N = 4 and T = 5. The 1st row contains 4 integers 4 3 2 1 from 4 to 1. The 2nd row contains 4 integers 2 4 6 8, which are twice the values in the 1st row in the reverse order. The 3rd row contains 4 integers 16 12 8 4, which are twice the values in the 2nd row in the reverse order. The 4th row contains 4 integers 8 16 24 32, which are twice the values in the 3rd row in the reverse order. The 5th row contains 4 integers 64 48 32 16, which are twice the values in the 4th row in the reverse order.
Example Input/Output 2:
Input:
5 4
Output:
5 4 3 2 1
2 4 6 8 10
20 16 12 8 4
8 16 24 32 40
(/)
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		long a[]=new long[n];
		int l=0,t=0;
        for(int i=n;i>=1;i--)
        {
            a[l++]=i;

            System.out.print(i+" ");
        }
        System.out.println();
        for(int j=1;j<k;j++)
        {
            int p=0;
            long c[]=new long[n];
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(a[i]*2+" ");
                c[p++]=a[i]*2;

            }
            for(int i=0;i<n;i++)
            {
                a[i]=c[i];
            }
            System.out.println();
        }

	}
}
