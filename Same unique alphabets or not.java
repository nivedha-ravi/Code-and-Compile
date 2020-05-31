/*
Input:
google lego
Output:
yes
Explanation:
The unique alphabets in the string google are g, o, l and e. The unique alphabets in the string lego are l, e, g and o. Here the given two string values contain the same unique alphabets. So yes is printed as the output.
Example Input/Output 2:
Input:
pot post
Output:
no
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
	    char[] ch1=s.toCharArray();
	    char[] ch2=s1.toCharArray();
	    Set<Character> a=new HashSet<Character>();
	    Set<Character> b=new HashSet<Character>();
	    for(char c:ch1)
	    {
	        a.add(c);
	    }
	    for(char c:ch2)
	    {
	        b.add(c);
	    }
	    List<Character> s2=new ArrayList<Character>(a);
	    List<Character> s3=new ArrayList<Character>(b);
	    Collections.sort(s2);
	    Collections.sort(s3);
	    if(s2.size()!=s3.size())
	    {
	        System.out.print("no");
	    }
	    else
	    {
	        for(int i=0,j=0;i<s2.size() && j<s3.size();i++,j++)
	        {
	            if(s2.get(i)!=s3.get(j))
	            {
	                System.out.print("no");
	                System.exit(1);
	            }
	        }
	        System.out.print("yes");
	    }

	}
}
