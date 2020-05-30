/*
INPUT:
apple 3
OUTPUT:
app ppl ple
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] ch=s.toCharArray();
		int n=in.nextInt();
    int j=0;
		for(int i=0;i<ch.length && j<ch.length;i++)
		{
		    int count=0;
		    count++;
		    System.out.print(ch[i]);
		    for(j=i+1;j<ch.length;j++)
		    {
		        if(count==n)
		        {
		            break;
		        }
		        else
		        {
		            System.out.print(ch[j]);
		            count++;
		        }
		    }
		    System.out.print(" ");
		}

	}
}
