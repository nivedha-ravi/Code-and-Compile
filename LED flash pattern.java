/*
Boundary Condition(s):
2 <= N <= 100 1 <= Each matrix element <= 10^8
Input Format:
The first line contains N. The next N lines, each contains N integers separated by a space.
Output Format:
The first line contains the highest lumen of the LED at every second in the matrix separated by a space.
Example Input/Output 1:
Input:
4
1 2 8 4
6 3 4 1
5 6 7 2
9 3 4 9
Output:
9 8 9 6 9 1 9
Explanation:
At t = 1, the lumen values of the flashing LEDs are given below.
1 2 8 4
6 3 4 1
5 6 7 2
9 3 4 9
Here 9 is the highest lumen value.
At t = 2, the lumen values of the flashing LEDs are given below.
1 2 8
6 3 4
5 6 7
Here 8 is the highest lumen value.
At t = 3, the lumen values of the flashing LEDs are given below.
3 4 1
6 7 2
3 4 9
Here 9 is the highest lumen value.
At t = 4, the lumen values of the flashing LEDs are given below.
1 2
6 3
Here 6 is the highest lumen value.
Similarly, at t = 5, 9 is the highest lumen value.
At t = 6, 1 is the only highest lumen value.
At t = 7, 9 is the only highest lumen value.
At t = 8, the pattern ends as all the LEDs not flashing at this time.
Hence the output is
9 8 9 6 9 1 9
Example Input/Output 2:
Input:
5
67 82 13 18 76
91 43 25 79 52
99 31 37 51 53
95 82 67 54 83
39 23 92 61 84
Output:
99 99 92 99 92 91 84 67 84
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=scan.nextInt();
		        max=Math.max(a[i][j],max);
		    }
		}
		System.out.print(max+" ");
		int aa=1;
		while(aa<n)
		{
		    max=Integer.MIN_VALUE;
		    for(int i=0;i<n-aa;i++)
		    {
		        for(int j=0;j<n-aa;j++)
		        {
		            max=Math.max(max,a[i][j]);

		        }
		    }
		    System.out.print(max+" ");
		    max=0;
		    for(int i=aa;i<n;i++)
		    {
		        for(int j=aa;j<n;j++)
		        {
		            max=Math.max(max,a[i][j]);
		        }
		    }
		    System.out.print(max+" ");
		    aa++;
		}
	}
}
