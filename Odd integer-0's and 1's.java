/*
INPUT:
2 3
OUTPUT:
25
INPUT:
4 0
OUTPUT:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] st=str.split(" ");
		int m=Integer.parseInt(st[0]);
		int n=Integer.parseInt(st[1]);
		String num="";
		for(int i=0;i<n-1;i++)
		{
		    num+='1';
		}
		for(int i=0;i<m;i++)
		{
		   num+='0';
		}
		num+='1';
		if(n==0)
		{
		    System.out.print("-1");
		}
		else
		{
		    System.out.print(Integer.parseInt(num,2));
		}

	}
}
