/*
Input:
communication
Output:
2
Explanation:
Here the string S = communication.
The characters c, o, m, n and i each occur twice.
The characters u, a and t each occur only once. So the number of occurrences of the most repeated character is 2. Hence the output is 2
Example Input/Output 2:
Input:
UpToDate
Output:
1
Example Input/Output 3:
Input:
Microprogramming100
Output:
3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char[] ch=s.toCharArray();
		Set<Integer> a=new HashSet<Integer>();
		for(int i=0;i<ch.length;i++)
		{   int count=0;
		    if(ch[i]!='\0')
		    {
		    for(int j=i+1;j<ch.length;j++)
		    {
		        if(ch[i]==ch[j])
		        {
		            count++;
		            ch[j]='\0';
		        }
		    }

		    a.add(count);
		    }
		}
		List<Integer> b=new ArrayList<Integer>(a);
		Collections.sort(b);
		System.out.print(b.get(b.size()-1)+1);



	}
}
