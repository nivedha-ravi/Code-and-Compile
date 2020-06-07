import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch[]=s.toCharArray();
		int length=ch.length;
		int len=length/2;
		ch[len]='*';
		if(length%2==0)
		{
		    ch[len-1]='*';
		}
		String str=new String(ch);
		System.out.print(str);
	}
}
