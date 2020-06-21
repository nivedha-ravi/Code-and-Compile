/*
INPUT:
aaaabbbbccccc
OUTPUT:
Yes
INPUT:
aABbGgHhT
aAAABbGggHh
OUTPUT:
No
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	Set<Character>st1= new LinkedHashSet<>();
	Set<Character>st2=new LinkedHashSet<>();
	for(int i=0;i<s1.length();i++)
	{
	    st1.add(s1.charAt(i));
	}
	for(int i=0;i<s2.length();i++)
	{
	    st2.add(s2.charAt(i));
	}
	String a1="",a2="";
	for(Character k:st1)
	{
	    a1+=k+"";
	}
	for(Character k:st2)
	{
	    a2+=k+"";
	}
	if(a1.equals(a2))
	{
	    System.out.println("Yes");
	    return;
	}

System.out.println("No");
	}
}
