/*
input: 
08-2019
18
output:
02-2021

input:
01-2013
11
output:
12-2013
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String[] str=s.split("-");
		int m=Integer.parseInt(str[0]);
		int y=Integer.parseInt(str[1]);
		int v=in.nextInt();
	    int count=0,i;
		for(i=m;;i++)
		{
		    if(count==v)
		    {
		        break;
		    }
		    count++;
		    if(i==12)
		    {
		        i=0;
		        y++;
		    }
		}
		System.out.printf("%02d-%d",i,y);
	}
}
