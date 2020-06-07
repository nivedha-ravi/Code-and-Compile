/*
INPUT:
2417
2
OUTPUT:
YES
INPUT:
99562403
3
OUTPUT:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		int d=in.nextInt();
		long sum=0L;
		while(n>0)
		{
		    sum=n%10+(n/10)%10;
		    if(sum%d!=0)
		    {
		        System.out.print("NO");
		        System.exit(1);
		    }
		    sum=0L;
		    n/=100;
		}
		System.out.print("YES");
	}
}
