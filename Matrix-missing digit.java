/*
Input: 6
1 3 4 6 7 3
0 9 6 1 5 2
2 7 5 4 8 9
5 1 0 6 7 5
4 9 8 1 0 2
2 3 7 4 8 9
Output:
8 0 6 3
Explanation:
We should consider the 3x3 matrix and find the missing digit.
In 1st 3x3 matrix,
1 3 4
0 9 6
2 7 5
the missing digit is 8
In 2nd 3x3 matrix,
6 7 3
1 5 2
4 8 9
the missing digit is 0
In 3rd 3x3 matrix,
5 1 0
4 9 8
2 3 7
the missing digit is 6
In 3rd 3x3 matrix,
6 7 5
1 0 2
4 8 9
the missing digit is 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    a[i][j]=scan.nextInt();
		}
    int s=45;
		for(int i=0;i<n;i=i+3)
		{
		    for(int j=0;j<n;j=j+3)
		    {
		        int sum=0;
		        for(int k=i;k<i+3;k++)
		        {
		            for(int h=j;h<j+3;h++)
		            sum+=a[k][h];
		        }
		        if(sum==s)
		        System.out.print(0+" ");
		        else
		        System.out.print(s-sum+" ");
		    }
		}
	}
}
