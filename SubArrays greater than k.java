/*
Example Input/Output 1:
Input:
4 10
55 10 23 5
Output:
8
Explanation:
The subarrays that have at least one integer value greater than 10 are (55), (23), (55, 10), (10, 23), (23, 5), (55, 10, 23), (10, 23, 5) and (55, 10, 23, 5).
So their count is 8 which is printed as the output.
Example Input/Output 2:
Input:
7 5
5 1 6 9 2 8 7
Output:
24
Example Input/Output 3:
Input:
4 33
12 25 16 21
Output:
0
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int m=i;m<=j;m++)
                {
                    if(a[m]>k)
                    {
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.print(count);
	}
}
