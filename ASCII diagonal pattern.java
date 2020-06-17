/*
INPUT:
mark
OUTPUT:
********109
******97***
***114*****
107********
INPUT:
skillrack
OUTPUT:
**********************115
*******************107***
****************105******
*************108*********
**********108************
*******114***************
*****97******************
***99********************
107**********************
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(in.nextLine());
		String s=sb.reverse().toString();
		for(int i=s.length()-1;i>=0;i--)
		{
		    for(int j=0;j<s.length();j++)
		    {
		        if(i==j)
		        {
		            int ch=(int)s.charAt(j);
		            System.out.print(ch);
		        }
		        else
		        {
		            String len=((int)s.charAt(j))+"";
		            for(int k=0;k<len.length();k++)
		            {
		                System.out.print("*");
		            }
		        }
		    }
		    System.out.println();
		}
	}
}
