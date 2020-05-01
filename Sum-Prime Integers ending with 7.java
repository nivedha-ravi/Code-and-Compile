/*
input:
156
output:
643
*/
import java.util.*;
public class Hello {
static boolean isPrime(int a)
{   int count=0;
    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
            return false;
        }
    }
    return true;

}
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long sum=0;
		for(int i=1;i<=n;i++)
		{
		    if(i%10==7)
		    {
		        if(isPrime(i))
		        {
		            sum=sum+i;
		        }
		    }
		}
		System.out.print(sum);
    }
}
