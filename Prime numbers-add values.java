/*
Example Input/Output 1:
Input:
7
89 54 36 74 44 19 12
Output:
0 5 1 5 3 0 1
Explanation: The integer 89 is a prime integer. So the smallest value to be added is 0. The smallest value to be added to 54 is 5. So the integer becomes 59, which is a prime integer. The smallest value to be added to 36 is 1. So the integer becomes 37, which is a prime integer. The smallest value to be added to 74 is 5. So the integer becomes 79, which is a prime integer. The smallest value to be added to 44 is 3. So the integer becomes 47, which is a prime integer. The integer 19 is a prime integer. So the smallest value to be added is 0. The smallest value to be added to 12 is 1. So the integer becomes 13, which is a prime integer. Hence the output is 0 5 1 5 3 0 1
*/
import java.util.*;
public class Hello {
    public static boolean isprime(int a)
    {
        if(a==2)
        {
            return true;
        }
        else if(a%2==0)
        {
            return false;
        }
        for(int i=3;i*i<=a;i+=2)
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
		for(int i=0;i<n;i++)
		{
            int a=in.nextInt();
            int c=0;
            while(!isprime(a))
            {
                c++;
                a++;
            }
            System.out.print(c+" ");
		}
	}
}
