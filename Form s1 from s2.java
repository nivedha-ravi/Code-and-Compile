
/*
Example Input/Output 1:
Input:
Laptop
lapoLptpAtpLoaKs
2
Output: YES
Explanation:
Here X=2, the string S1 is Laptop and the string S2 is lapoLptpAtpLoaKs.
The string Laptop can be formed from the alphabets of lapoLptpAtpLoaKs for 2 times.
Hence the output is YES
Example Input/Output 2:
Input:
CONTINENT
CpTkOiNqunptsNe
1
Output: NO
Example Input/Output 3:
Input:
Abc#123
a#cE#23pb1bA12AcLK13LAb#32cP
3
Output: YES
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] s1=in.next().toCharArray();
		int n=in.nextInt();
		String d="";
		for(int i=0;i<s.length();i++)
		{
		    int count=0;
		    for(int j=0;j<s1.length;j++)
		    {
		        if(s.charAt(i)==s1[j] && s1[j]!=' ')
		        {
		            if(count==n)
		            {
		                break;
		            }
		            count++;
		            s1[j]=' ';
		        }
		    }
		    if(count>=n)
		    {
		        d+=s.charAt(i);
		    }

		}
		System.out.print((s.equals(d))?"YES":"NO");


	}
}
