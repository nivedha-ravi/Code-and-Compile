/*
INPUT:
100
OUTPUT:
6
INPUT:
146
OUTPUT:
6
*/
import java.util.*;
public class Hello {
    static int isPrime(int a)
    {
        for(int i=2;i<a;i++)
        {   if(a%i==0)
        {
            return 0;
        }
        }
        return 1;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int prime[]=new int[n];
		int k=0;
		for(int i=2;i<=n;i++)
		{
		    if(isPrime(i)==1)
		    {
		        prime[k++]=i;
		    }
		}
		int count=0;
		for(int i=0;i<k;i++)
		{
		    for(int j=i;j<k;j++)
		    {
		        if(prime[i]+prime[j]==n)
		        {
		            count++;
		        }
		    }
		}
		System.out.print(count);


	}
}
