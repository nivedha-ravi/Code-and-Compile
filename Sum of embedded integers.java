/*
INPUT:
12abc20yz68
OUTPUT:
100
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String temp="0";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(Character.isDigit(ch))
		    {
		        temp+=ch;
		    }
		    else
		    {
		        sum+=Integer.parseInt(temp);
		        temp="";
		    }
		}
		System.out.print(sum+Integer.parseInt(temp));

	}
}
