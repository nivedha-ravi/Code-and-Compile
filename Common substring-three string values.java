/*
Example Input/Output 1:
Input:
Abcdefghxyz xyz Abcxyz
Output:
xyz
Explanation:
The longest common substring in Abcdefghxyz, xyz and Abcxyz is xyz.
So xyz is printed as the output.
Example Input/Output 2:
Input:
Pqrstuv Ab@cdefgh ijklmn@
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),b=sc.next(),c=sc.next();
		int max=Integer.MIN_VALUE;
		String ans="";
		for(int i=0;i<s.length();i++)
		{
		    for(int j=s.length();j>=i;j--)
		    {
		        String t=s.substring(i,j);
		        if(b.contains(t) && c.contains(t) && t.length()>max)
		        {
		            ans=t;
		            max=t.length();
		        }
		    }
		}
		if(max>0)
		System.out.print(ans);
		else
		System.out.print(-1);
	}
}
