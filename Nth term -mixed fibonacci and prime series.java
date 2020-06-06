/*
0,2,1,3,1,5,2,7,3,11,5,13,8,17,....

This series is a mixture of 2 series fail the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order
*/
import java.util.*;
public class Hello {
    public static void fibonacci(int n)
    {
        int a=0,b=1,next;
        for(int i=1;i<=n;i++)
        {
            next=a+b;
            a=b;
            b=next;
        }
        System.out.print(a);
    }
    public static void prime(int n)
    {   int count=0;
        for(int i=2;i<=Integer.MAX_VALUE;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                if(++count==n)
                {
                    System.out.print(i);
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n%2!=0)
    {
        fibonacci(n/2);
    }
    else
    {
        prime(n/2);
    }

  }
}
