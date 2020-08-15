/*
Example Input/Output 1:
Input: 3
Output: 30
Explanation: The first 3 prime integers are 2, 3 and 5.
So their product 30 (2 * 3 * 5) is printed as the output.
Example Input/Output 2:
Input: 5
Output: 2310
*/
import java.util.*;
public class Hello {
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long prod=1;
        int count=0;
        for(int i=2;;i++)
        {
            if(isPrime(i))
            {
                prod*=i;
                count++;
            }
            if(count==n)
            {
                break;
            }
        }
        System.out.print(prod);

	}
}
