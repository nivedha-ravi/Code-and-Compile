//*
INPUT:
121
OUTPUT:
131
*//
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		n++;
		for(;;n++)
		{
		    int temp=n,sum=0;
		    while(temp>0)
		    {
		        sum=(sum*10)+(temp%10);
		        temp/=10;
		    }
		    if(n==sum)
		    {
		        System.out.print(n);
		        break;
		    }
		}
	}
}
