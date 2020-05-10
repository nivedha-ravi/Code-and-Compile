/*
INPUT:
skillrack
OUTPUT:
acikkllrs
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String s=new String(ch);
		System.out.print(s);

	}
}
