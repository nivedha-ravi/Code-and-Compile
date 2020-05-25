
import java.util.*;
public class Hello {
    public static int factorial(long num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long sum=0L;
		while(n>0)
		{
		    long temp=n%10;
		    sum=sum+factorial(temp);
		    n/=10;
		}
		System.out.print(sum);


	}
}
