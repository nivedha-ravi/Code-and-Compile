/*
INPUT:
3
OUTPUT:
1 5 15
INPUT:
7
OUTPUT:
1 5 15 34 65 111 175
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
		    double m=Math.pow(i,2);
		    int d=(i*((int)m+1))/2;
		    System.out.print(d+" ");
		}


	}
}
