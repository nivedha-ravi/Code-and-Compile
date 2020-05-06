/*
INPUT:
27
OUTPUT:
80.60
INPUT:
-12.7
OUTPUT:
9.14
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    float cel=in.nextFloat();
	    float fah=(cel*9/5)+32;
	    System.out.printf("%.2f",fah);

	}
}
