/*
The program should print YES if the first digit of the number equals to the number of zeros in the integer and second digit of the number equals to the number of ones in the integer else print NO
INPUT:
21400
OUTPUT:
YES
INPUT:
11110
OUTPUT:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int first=s.charAt(0)-'0';
		int last=s.charAt(1)-'0';
		int zero=0,ones=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='0')
		    {
		        zero++;
		    }
		    else if(s.charAt(i)=='1')
		    {
		        ones++;
		    }
		}
		System.out.print((zero==first && ones==last)?"YES":"NO");

	}
}
