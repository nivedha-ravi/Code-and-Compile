/*
INPUT:
Skill_RacK!
OUTPUT:
3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int lower=0,upper=0;
		for(int i=0;i<s.length();i++)
		{
		    if(Character.isUpperCase(s.charAt(i)))
		    {
		        upper++;
		    }
		    else if(Character.isLowerCase(s.charAt(i)))
		    {
		        lower++;
		    }
		}
		if(upper==s.length()||lower==s.length())
		{
		    System.out.print("0");
		}
		else if(upper>lower)
		{
		    System.out.print(lower);
		}
		else
		{
		    System.out.print(upper);
		}

	}
}
