/*
 Input:
 101 120 2
 Output:
 101 110 111 112 113 114 115 116 117 118 119
 Explanation: Here X = 101, Y = 120 and N = 2. In the range of 101 to 120 (both inclusive), the integers with at most 2 unique digits are 101 110 111 112 113 114 115 116 117 118 119. Hence the output is 101 110 111 112 113 114 115 116 117 118 119
 Example Input/Output 2:
 Input:
 23 32 1
 Output:
 -1
 */
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long x=in.nextInt();
		long y=in.nextInt();
		int n=in.nextInt();
		int flag=0;
		for(long i=x;i<=y;i++)
		{
		    char[] s=Long.toString(i).toCharArray();
		    Set<Character> sb=new HashSet<Character>();
		    for(int ii=0;ii<s.length;ii++)
		    {
		        sb.add(s[ii]);
		    }
		        if(sb.size()<=n)
		        {
		            System.out.print(i+" ");
		            flag=1;
		        }
		        sb=null;

		}
		if(flag==0)
		{
		    System.out.print("-1");
		}
	}
}
