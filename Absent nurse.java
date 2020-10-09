/*
Example Input/Output 1:
Input:
3
DEFGADC
ABCDEFG
FEBCDAB
Output:
B D
-1
G B
Explanation:
In the 1st week, nurse B is on leave and nurse D is on duty. So B D are printed.
In the 2nd week, no one takes leave. So -1 is printed.
In the 3rd week, nurse G is on leave and nurse B is on duty, so G B are printed.
Example Input/Output 2:
Input:
4
GEFCABD
GFACBCD
FFGADEB
CDAGFEA
Output:
-1
E C
C F
B A
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String s=sc.next();
		    HashSet<Character> hs=new HashSet<>();
		    ArrayList<Character> ar=new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G'));
		    ArrayList<Character> dup=new ArrayList<>();
		    for(int j=0;j<s.length();j++)
		    {
		        if(hs.contains(s.charAt(j)))
		        dup.add(s.charAt(j));
		        else
		        {
		            hs.add(s.charAt(j));
		            ar.remove(Character.valueOf(s.charAt(j)));
		        }
		    }
		    if(hs.size()==7)
		    System.out.println(-1);
		    else
		    System.out.println(ar.get(0)+" "+dup.get(0));
		}

	}
}
