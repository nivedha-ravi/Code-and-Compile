/*
INPUT:
Welcome to Home
OUTPUT:
WelcometoHome
Welcom*t*Hom*
Welco****Ho**
Welc*****H***
Wel**********
We***********
W************
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int max = 0;
		for(int i = 0;i < s.length; i++)
		max = Math.max(s[i].length(),max);
		int count = 0;
		for(int i = 1;i <= max; i++){
		    for(int j = 0;j < s.length; j++) {
		        StringBuilder sb = new StringBuilder(s[j]);
		        try {
		            sb.setCharAt(sb.length()-count,'*');
		            String k = sb.toString();
		            s[j] = k;
		            System.out.print(sb.toString());
		        }catch(Exception e) {
		            String k = sb.toString();
		            s[j] = k;
		            System.out.print(s[j]);
		        }
		    }
		    System.out.println();
		    ++count;
		}
	}
}
