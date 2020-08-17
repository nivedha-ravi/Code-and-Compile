/*
Example Input/Output 1:
Input:
7
5 4 0 3 1 6 2
Output:
4
Explanation:
One of the possible ways to open four rooms is given below.
0 -> 5 -> 6 -> 2 -> 0 Here the maximum number of rooms that can be opened by the boy is 4, so 4 is printed as the output.
Example Input/Output 2:
Input:
9
6 7 2 0 1 3 4 5 8
Output:
7
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
		int max=0;
		for(int i=0;i<n;i++)
		{
		    int temp=i;
		    int startindex=i;
		    int count=0;
		    while(true)
		    {
		      int currentroomkey=a[temp];
		      temp=currentroomkey;
		      count++;
		      if(currentroomkey==startindex)
		      {
		          break;
		      }
		    }
		   if(max<count)
		   {
		       max=count;
		   }
		}
		System.out.print(max);


	}
}
