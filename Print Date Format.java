/*
Example Input/Output 1:
Input: 02-Nov-2012
Output: DD-MMM-YYYY
Explanation: Here the given date is 02-Nov-2012, which is in the format DD-MMM-YYYY. Hence the output is DD-MMM-YYYY
Example Input/Output 2:
Input: 1997-27-02
Output: YYYY-DD-MM
Example Input/Output 3:
Input: 04-06-2017
Output: -1
Explanation: Here two formats are applicable, they are DD-MM-YYYY and MM-DD-YYYY. Hence the output is -1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s[]=in.next().split("-");
		String d="";
		int flag=0;
		for(int i=0;i<s.length;i++)
		{ int len=s[i].length();

		    if(len==3)
		    {
		        d+="MMM";
		        flag=1;
		    }
		    else if(len==4)
		    {
		        d+="YYYY";
		    }
		   else if(len==2)
		   {    int n=Integer.parseInt(s[i]);
	          if(d.contains("DD"))
		       {
		           if(n>=1 && n<=12)
		           {
		            d+="MM";
		           }
		           else if(n>12 && n<=31)
		           {
		            d=d.replace("DD","MM");
		            d+="DD";
		           }

		       }
		       else if(!(d.contains("DD")))
		       {
		           if(n>=1 && n<=31)
		           {
		            d+="DD";
		           }
		       }
		   }
		    if(i!=s.length-1)
		    {
		        d+="-";
		    }
		}
		if(flag==0)
		{
		for(int i=0;i<s.length;i++)
		{
		    int n=Integer.parseInt(s[i]);
		    if(n>=1 && n<=12)
		    {
		       for(int j=i+1;j<s.length;j++)
		       {
		           n=Integer.parseInt(s[j]);
		           if(n>=1 && n<=12)
		           {
		               System.out.print("-1");
		               System.exit(1);
		           }
		       }
		    }
		}
		}
		System.out.print(d);


	}
}
