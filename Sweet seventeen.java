/*
Given a maximum of four digit base 17 representation to the base 17 (10->A,11->B,12->C...16->G) as input.
output its decimal value.
If the input is not a valid base 17 representation, then print Invalid as the output.
Example Input/Output 1:
Input:
1A
Output:
27
Example Input/Output 2:
Input:
23GF
Output:
10980
Example Input/Output 3:
Input:
1X
Output:
Invalid
*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		hmap.put('A',10);
		hmap.put('B',11);
		hmap.put('C',12);
		hmap.put('D',13);
		hmap.put('E',14);
		hmap.put('F',15);
		hmap.put('G',16);
		hmap.put('a',10);
		hmap.put('b',11);
		hmap.put('c',12);
		hmap.put('d',13);
		hmap.put('e',14);
		hmap.put('f',15);
		hmap.put('g',16);
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		long num=0;
		int k=0;
		for(int i=s.length()-1;i>=0;i--)
		{
		    if((s.charAt(i)>='a'&& s.charAt(i)<='g')||(s.charAt(i)>='A'&& s.charAt(i)<='G'))
		    {
		        num=num+hmap.get(s.charAt(i))*(int)Math.pow(17,k++);
		    }
		    else if(Character.isDigit(s.charAt(i))){
		        num=num+((s.charAt(i)-'0')*(int)Math.pow(17,k++));
		    }
		    else
		    {
		        System.out.print("Invalid");
		        System.exit(1);
		    }
		}
		System.out.print(num);

	}
}
