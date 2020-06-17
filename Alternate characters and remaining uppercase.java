/*
INPUT:
abcd
efghijklmnop12
OUTPUT:
aebfcgdhIJKLMNOP12
INPUT:
abcd
RSTU
OUTPUT:
aRbScTdU
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int printed=0,len1=s1.length(),len2=s2.length(),n=len1+len2,i=0,j=0;
		while(printed<n)
		{
		    if(i<len1)
		    {
		        if(printed>=len2)
		        {
		            System.out.print((Character.isAlphabetic(s1.charAt(i))?Character.toUpperCase(s1.charAt(i)):s1.charAt(i)));
		        }
		        else{
		            System.out.print(s1.charAt(i));
		        }
		        i++;
		    }
		    if(j<len2)
		    {
		        if(printed>=len1)
		        {
		            System.out.print((Character.isAlphabetic(s2.charAt(j))?Character.toUpperCase(s2.charAt(j)):s2.charAt(j)));
		        }
		        else
		        {
		            System.out.print(s2.charAt(j));
		        }
		        j++;
		    }
		    printed++;
		}

	}
}
