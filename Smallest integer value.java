/*
Example Input/Output 1:
Input:
6 1 2 4 9 5 1
Output:
23
Explanation: The integer 1 is not possible as 1 is present in the given 6 integers. The integer 2 is not possible as 2 is present in the given 6 integers. The integer 3 is not possible as 1 and 2 are present in the given 6 integers. The integer 4 is not possible as 4 is present in the given 6 integers. The integer 5 is not possible as 5 is present in the given 6 integers. The integer 6 is not possible as 1 and 5 are present in the given 6 integers. Similarly, up to 22 is not possible, because there is a combination that provides the same value. The smallest integer value which is not equal to the sum of any combination of integers among the given 6 integers is 23. So 23 is printed as the output.
Example Input/Output 2: Input:
5 17 9 15 2 4
Output:
1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int sum=1;
		for(int i=0;i<n;i++)
		{
		    int num=in.nextInt();
		    a[i]=num;
		}
	    Arrays.sort(a);
	    for(int i=0;i<n;i++)
	    {
	        if(sum>=a[i])
	        {
	            sum+=a[i];
	        }
	        else
	        {
	            break;
	        }
	    }
	    System.out.print(sum);


	}
}
