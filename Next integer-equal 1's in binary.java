import java.util.*;
public class Hello
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=Integer.bitCount(n);
        for(int index=n+1;index<100000000;index++)
        {
            int nextCount=Integer.bitCount(index);
            if(count==nextCount)
            {
                System.out.print(index);
                return;
            }
        }
	}
}
