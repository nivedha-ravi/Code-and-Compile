/*
input: abbaabbacddc
2
output: 8
input: ABCDaABCDa
4
output: 4
input: aaalllaAAAlll
3
output: 13
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt(),max=0,len=s.length();
	for(int i=0;i<len;i++){
	    for(int j=i+1;j<=len;j++){
	    String res=s.substring(i,j);
	    Set<Character> set=new HashSet<>();
	    for(char ch:res.toCharArray())
	    set.add(ch);
	    if(set.size()==n){
	        max=Math.max(max,res.length());
	    }
	    }
	}System.out.print(max);

	}
}
		(or)

import java.util.*;
class Main
{
	public static String lonSubstr(String a, int k)
	{
		int end=0,begin=0;
		Set<Character> s= new HashSet<>();
		int[]  b= new int[126];
		for (int i=0, j=0; j<a.length();j++)
		{
			s.add(a.charAt(j));
			b[a.charAt(j)]++;
			while (s.size()>k)
			{
				if (--b[a.charAt(i)]==0) {
					s.remove(a.charAt(i));
				}
				i++;
			}
			if (end-begin<j-i)
			{
				end=j;
				begin=i;
			}
		}
		return a.substring(begin,end+1);
	}

	public static void main(String[] args)
	{
	      	Scanner sc=new Scanner(System.in);
		String str =sc.next();
		int k =sc.nextInt();
        	String a=lonSubstr(str, k);
        	System.out.print(a.length());
	}
}
