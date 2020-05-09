/*
INPUT:
6
www.skillrack.com
http://www.skillrack.com
https://www.skillrack.com
www.google.com
http://www.google.com
google.com
OUTPUT:
2
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    str[i]=in.nextLine();
		    if(str[i].charAt(0)=='h'||(str[i].charAt(0)=='w' && str[i].charAt(1)=='w'))
		    {
		        int k=0;
		        for(int j=0;j<str[i].length();j++)
		        {
		            if(str[i].charAt(j)=='.')
		            {
		                k=j;
		                break;
		            }
		        }
		        str[i]=str[i].replace(str[i].substring(0,k+1),"");
		    }
		}
		Arrays.sort(str);
		int count=0;
		for(int i=0;i<n;i++)
		{
		    if(i<n-1)
		    {
		        if(str[i].equals(str[i+1]))
		        {
		            continue;
		        }
		    }
		    count++;
		}
		System.out.print(count);

	}
}
