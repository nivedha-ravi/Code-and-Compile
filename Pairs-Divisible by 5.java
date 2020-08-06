/*
Example Input/Output 1:
Input: 7 5
Output: 5
Explanation:
The integers from 1 to 7 are 1, 2, 3, 4, 5, 6 and 7.
The integers from 1 to 5 are 1, 2, 3, 4 are 5.
The 5 possible pairs are given below.
(7 and 3 in not considered as already 3 in the second list has been used with 2).
1 4
2 3
3 2
4 1
5 5
Example Input/Output 2:
Input: 16 18
Output: 15
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		int count=0,k=0,l=0;
		for(int i=1;i<=m;i++)
		{
		    a[l++]=i;
		}
		for(int i=1;i<=n;i++)
		{
		    b[k++]=i;
		}
		for(int i=0;i<l;i++)
		{
		    for(int j=0;j<k;j++)
		    {
		        if((a[i]+b[j])%5==0 && b[j]!=-1)
		        {
		            count++;
		            b[j]=-1;
		            break;
		        }
		    }
		}
		System.out.print(count);

	}
}
