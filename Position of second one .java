/*
INPUT:
13 5
OUTPUT:
4
Explanation:
13+5=18(10010)
Position of second one is 4.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int c=m+n;
		String s=Integer.toBinaryString(c);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='1')
		    {
		        count++;
		    }
		    if(count==2)
		    {
		        System.out.print(i+1);
		        break;
		    }
		}
		if(count==1)
		{
		    System.out.print("0");
		}
	}
} 2
