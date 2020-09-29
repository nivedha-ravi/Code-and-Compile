import java.util.*;
public class Hello {
    public static boolean isPrime(int n)
    {
        String s=Integer.toString(n);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='2'||ch=='3'||ch=='5'||ch=='7')
            {
                count++;
            }
        }
        if(count==s.length())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		n++;
		for(;;n++)
		{
		    if(isPrime(n))
		    {
		        System.out.print(n);
		        break;
		    }
		}

	}
}
