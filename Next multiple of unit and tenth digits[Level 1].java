/*
INPUT:
524
OUTPUT:
528
INPUT:
50
OUTPUT:
60
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int lasttwo=n%100;
		int unit=n%10;
		int tenth=(n/10)%10;
		if(unit==0||tenth==0)
		{
		    System.out.print(n+10);
		}
		else
		{
		    for(int i=n;;i++)
		    {
		        if(i%lasttwo==0)
		        {
		            System.out.print(i);
		            break;
		        }
		    }
		}


	}
}
