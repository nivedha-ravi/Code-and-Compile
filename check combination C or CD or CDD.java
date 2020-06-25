/*
INPUT:
CDCDDCCCCDD
OUTPUT:
yes
INPUT:
CCCCCDCDDD
OUTPUT:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		String s=new Scanner(System.in).next();
		s=s.replaceAll("CDD","").replaceAll("CD","").replaceAll("C","");
		System.out.print((s.length()==0)?"yes":"no");

	}
