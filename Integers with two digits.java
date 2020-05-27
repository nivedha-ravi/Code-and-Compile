/*
INPUT:
57755
OUTPUT:
YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		Set<Character> count=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
		    count.add(ch[i]);
		}
		if(count.size()==2)
		{
		    System.out.print("YES");
		}
		else
		{
		    System.out.print("NO");
		}


	}
}
