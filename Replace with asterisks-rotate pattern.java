/*input:
program
rock
output:
p**g*am
**g*amp
*g*amp*
g*amp**
*amp**g
amp**g*
mp**g*a
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		for(int i=0;i<s1.length();i++)
		{
		    for(int j=0;j<s.length();j++)
		    {
		        if(s1.charAt(i)==s.charAt(j))
		        {
		            s=s.replace(s.charAt(j),'*');
		        }

		    }
		}
		int len=s.length();
		for(int i=0;i<len;i++)
		{
		    for(int j=i;j<i+len;j++)
		    {
		        System.out.print(s.charAt(j%len));
		    }
		    System.out.println();
		}

	}
}
