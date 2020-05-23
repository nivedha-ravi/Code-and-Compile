/*
INPUT:
5
rotator
madam
auto
bomb
travels
OUTPUT:
bomb
madam
auto
rotator
travels
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	List<String>li= new LinkedList<>();
	String ss[]= new String[n];
	sc.nextLine();
	for(int i=0;i<n;i++)
	{
	    String x=sc.nextLine();
	    if(x.charAt(0)==x.charAt(x.length()-1))
	    {
	        li.add(x);
	    }
	    ss[i]=x;
	}
	Collections.sort(li);
	int k=0;
	for(int i=0;i<ss.length;i++)
	{
	    if(li.contains(ss[i]))
	    {
	        System.out.println(li.get(k++));
	    }
	    else
	    {
	        System.out.println(ss[i]);
	    }
	}

	}
}
