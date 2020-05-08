/*
INPUT:
5 6
OUTPUT:
55555
25252
16161
15151
13131
99999
EXPLANATION:
1st row-sum-25
2nd row sum-16
3rd row sum-15
4th row sum-13
5th row sum-9
6th row sum-9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int j=in.nextInt();
		int i=in.nextInt();
		int num=j;
		for(int x=0;x<i;x++)
		{
		    String str=String.valueOf(num);
		    num=0;
		    int s=0;
		    String res="";
		    while(res.length()<j)
		    {
		        res=res+str.charAt(s);
		        num=num+Character.getNumericValue(str.charAt(s));
		        s++;
		        if(s==str.length())
		        {
		            s=0;
		        }
		    }

		System.out.println(res);
		}
	}
}
