/*
INPUT:
145
OUTPUT:
3
INPUT:
3
OUTPUT:
1
*/
import java.util.*;
public class Hello {
    public static long palindrome(long a)
    {
        long sum=0,temp=a;
        while(a>0)
        {
            sum=(sum*10)+(a%10);
            a/=10;
        }
        if(temp==sum)
        {
            return temp;
        }
        return palindrome(temp+sum);
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long num=in.nextLong();
		if(num>=1 && num<=9)
		{
		    System.out.print("1");
		}
		else
		{
		    System.out.print(Long.toString(palindrome(num)).length());
		}



		}
}
