/*
INPUT:
skill rack 5
OUTPUT:
no
INPUT:
AbcdefGh abceff 6
OUTPUT:
yes
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		int k=in.nextInt();
		char[] c=s.toCharArray();
		char[] ch=s1.toCharArray();
		int count=0,l1=c.length,l2=ch.length;
		for(int i=0;i<c.length;i++)
		{
		    for(int j=0;j<ch.length;j++)
		    {
		        if(c[i]==ch[j])
		        {
		            count++;
		            break;
		        }
		    }
		}
		int m=(l1+l2)-(count*2);
		System.out.print((m==k)?"yes":"no");

	}
}
