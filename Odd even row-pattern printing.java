/*
INPUT:
5
OUTPUT:
*1
21*
*123
4321*
*12345
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print("*");
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            else if(i%2==0)
            {
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println("*");
            }
        }

	}
}
