/*
INPUT:
5 3
apple orange orange orange Banana
OUTPUT:
yes
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    str[i]=in.next();
		}
		for(int i=0;i<n;i++)
		{   int count=0;
		    for(int j=i+1;j<n;j++)
		    {
		        if(str[i].equalsIgnoreCase(str[j]))
		        {
		            count++;
		        }
		        else
		        {
		            break;
		        }
		    }
		    if(count>=k-1)
		    {
		        System.out.print("yes");
		        System.exit(1);
		    }
		}
        System.out.print("no");
	}
}
