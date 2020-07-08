/*
INPUT:
5
1 2 3 4 5
5 4 3 2 1
4 3 2 1 5
2 3 4 5 1
3 4 5 2 1
OUTPUT:
5 4 3 2 1 5 4 2 3
1 5 1 1 2 5 4 3
2 3 4 3 3 4
1 5 2 5 4
2 4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,r=0;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    a[i][j]=sc.nextInt();
		}
		while(r<n)
		{
		    if(r!=0)
		    System.out.println();
		    for(i=n-1;i>=r;i--)
		    System.out.print(a[r][i]+" ");
		    for(i=r+1;i<n;i++)
		    System.out.print(a[i][r]+" ");
		    System.out.println();
		    for(i=r+1;i<n;i++)
		    System.out.print(a[i][n-1]+" ");
		    for(i=n-2;i>r;i--)
		    System.out.print(a[n-1][i]+" ");
		    r++;
		    n--;
		}
	}
}
