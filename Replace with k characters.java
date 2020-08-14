/*
Example Input/Output 1:
Input:
skill 3
skillrack helps students to succeed
Output:
skill helps students to succeed
Explanation:
Here W = skill and K = 3.
The first three characters in W are ski.
The only word that has the first three characters as ski in the string "skillrack helps students to succeed" is skillrack.
So it is replaced with skill.
Hence the output is skill helps students to succeed
Example Input/Output 2:
Input:
happy 4
WORK HAPPENS TO LIVE HAPPIER NOT TO HATE
Output:
WORK happy TO LIVE happy NOT TO HATE
Example Input/Output 3:
Input:
#5467 2
@abcd #521A
Output:
@abcd #5467
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		in.nextLine();
		String[] str=in.nextLine().split(" ");
		for(int i=0;i<str.length;i++)
		{
		    String st=s.substring(0,n);
		    if(str[i].length()>=n)
		    {
		    if(st.equalsIgnoreCase(str[i].substring(0,n)))
		    {
		        System.out.print(s+" ");
		    }
		    else
		    {
		        System.out.print(str[i]+" ");
		    }
		    }
		    else
		    {
		        System.out.print(str[i]+" ");
		    }

		}

	}
}
