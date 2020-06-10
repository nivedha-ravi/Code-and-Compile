/*
An integer is said to be circular prime if all rotations of its digits are prime.
INPUT:
131
OUTPUT:
YES
permutations-131 113 331
INPUT:
457
OUTPUT:
NO
*/
import java.util.*;
public class Hello {
public static int isPrime(int n)
{
    if(n%2==0||n%3==0)
    {
        return 1;
    }
    for(int i=5;i*i<=n;i+=6)
    {
        if(n%i==0||n%(i+2)==0)
        {
            return 1;
        }
    }
    return 0;
}
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int c=0,temp=n;
		while(temp>0)
		{
		    c++;
		    temp/=10;
		}
		int num=n,flag=0;
		while(isPrime(num)==0)
		{
		    int rem=num%10;
		    int di=num/10;
		    num=(int)((Math.pow(10,c-1))*rem)+di;//permutations
		    if(num==n)
		    {
		       System.out.print("YES");
		       System.exit(1);
		    }
		}
		System.out.print("NO");

	}
}
