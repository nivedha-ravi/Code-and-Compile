import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		    String s=in.next();
		    System.out.print(Character.toUpperCase(s.charAt(0))+s.substring(1,s.length()));
		}

	}
}
