
/*input: 3 4
4 9 7 2
5 6 2 3
8 1 10 6

output:
1 2 3 4
10 6 2 5
9 8 7 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][y];
		int[] so = new int[2000];
		int l = 0;
		for(int i=0;i<x;i++)
		{
		    for(int j=0;j<y;j++)
		    {
		        arr[i][j] = sc.nextInt();
		        if(i==0 || i==x-1 || j==0 || j==y-1)
		            so[l++] = arr[i][j];
		    }
		}
		int q=0;
		for(int i=0;i<l-1;i++)
		{
		    for(int j=i+1;j<l;j++)
		    {
		        if(so[i]>=so[j])
		        {
		            int t = so[i];
		            so[i] = so[j];
		            so[j] = t;
		        }
		    }
		}
		for(int i=0;i<y;i++)
		    System.out.print(so[q++]+" ");
		System.out.println();
		l--;
	    for(int i=1;i<x-1;i++)
	    {
	        for(int j=0;j<y;j++)
	        {
	            if(j==0)
	                System.out.print(so[l--]+" ");
	            else if(j==y-1)
	                System.out.print(so[q++]+" ");
	            else
    	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
	    for(int i=0;i<y;i++)
	        System.out.print(so[l--]+" ");
	}
}
