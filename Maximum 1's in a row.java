
/*
INPUT:
4 5
1 1 0 0 1
0 0 1 0 0
1 1 0 1 1
1 0 0 0 0
OUTPUT:
4
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String st[]=str.split(" ");
		int r=Integer.parseInt(st[0]);
		int c=Integer.parseInt(st[1]);
		int a[][]=new int[r][c];
		int max=0;
		for(int i=0;i<r;i++)
		{   int count=0;
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		        if(a[i][j]==1)
		        {
		            count++;
		        }
		    }
		    if(count>max)
		    {
		        max=count;
		    }
		}
		System.out.print(max);

	}
}
