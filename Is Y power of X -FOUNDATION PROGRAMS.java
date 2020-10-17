/*
Input:
5 125
Output:
Yes
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		while(y%x==0)
		{
		    y/=x;
		}
		System.out.print((y==1)?"Yes":"No");

	}
}
