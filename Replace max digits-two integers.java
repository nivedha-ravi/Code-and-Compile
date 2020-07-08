/*
Input:
1878 2020
Output:
3292
Explanation:
Here X = 1878 and Y = 2020. After replacing all the occurrences of the maximum digit 8 in 1878 with the maximum digit 2 in 2020, the integer 1878 becomes 1272. Here the sum of 1272 and 2020 is 3292. Hence the output is 3292
Example Input/Output 2:
Input:
1111 144
Output:
4588
Example Input/Output 3:
Input:
189 1239
Output: 1428
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String x=in.next();
		String y=in.next();
		Set<Character> s=new TreeSet<Character>();
		Set<Character> s1=new TreeSet<Character>();
		for(int i=0;i<x.length;i++)
		{
		    s.add(x.charAt(i));
		}
		for(int i=0;i<y.length();i++)
		{
		    s1.add(y.charAt(i));
		}
		List<Character> a=new ArrayList<Character>(s);
		List<Character> b=new ArrayList<Character>(s1);
		char max1=a.get(a.size()-1);
		char max2=b.get(b.size()-1);
		for(int i=0;i<x.length;i++)
		{
		    if(x.charAt(i)==max1)
		    {
		        x=x.replace(x.charAt(i),max2);
		    }
		}
		System.out.print(Integer.parseInt(x)+Integer.parseInt(y));

	}
}
