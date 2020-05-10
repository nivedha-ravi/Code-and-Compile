/*
INPUT:
2 5 15
OUTPUT:
2 3 4 5 2 3 4 5 2 3 4 5 2 3 4
*/
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] st=str.split(" ");
		int m=Integer.parseInt(st[0]);
		int n=Integer.parseInt(st[1]);
		int k=Integer.parseInt(st[2]);
		int printed=0;
		while(printed<k)
		{
		    for(int i=m;i<=n;i++)
		    {
		        if(printed!=k)
		        {
		        System.out.print(i+" ");
		        printed++;
		        }
		        else
		        {
		            break;
		        }
		    }
		}
	}
}
