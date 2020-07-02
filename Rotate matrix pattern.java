/*
Example Input/Output 1:
Input:
3
1 2 3
4 5 6
7 8 9
Output:
**1
*4 2
7 5 3
*8 6
**9
Explanation: After rotating the matrix by 45 degrees in the clockwise direction, the matrix becomes 1 4 2 7 5 3 8 6 9 So the rotated matrix is printed and the asterisks are printed instead of empty places.
Example Input/Output 2:
Input:
4
13 21 36 49
55 65 57 80
17 32 63 44
56 60 78 98
Output:
***13
**55 21
*17 65 36
56 32 57 49
*60 63 80
**78 44
***98
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		int b[]=new int[100];
		int z[]=new int[100];
		int ryt=0,lef=0,c=0;
		while(ryt<n)
		{
		    int i,j,k=0,count=0;
		    for(i=ryt,j=0;i>=0 && j<n;i--,j++)
		    {
		        b[k++]=a[i][j];
		    }
		    int f=0;
		    while(k<n)
		    {
		        System.out.print("*");
		        f++;
		        k++;
		    }
		    int res=0;
		    for(int x=0;x<k;x++)
		    {
		        if(b[x]!=-1)
		        {
		            System.out.print(b[x]+" ");
		            res++;
		            b[x]=-1;
		        }
		        if(f+res==n)
		        {
		            break;
		        }
		    }
		    ryt++;
		    lef++;
		    System.out.println();
		}
		ryt=n-1;
		c=1;
		while(lef<(n+n)-1)
		{
		    int i,j,k=0,count=0;
		    for(i=ryt,j=c;i>=0 && j<n;i--,j++)
		    {
		        z[k++]=a[i][j];
		    }
		    int f=0;
		    while(k<n)
		    {
		        System.out.print("*");
		        f++;
		        k++;
		    }
		    int res=0;
		    for(int x=0;x<k;x++)
		    {
		        if(z[x]!=-1)
		        {
		            System.out.print(z[x]+" ");
		            res++;
		            z[x]=-1;
		        }
		        if(f+res==n)
		        {
		            break;
		        }
		    }
		    lef++;
		    c++;
		    System.out.println();
		}

	}
}
