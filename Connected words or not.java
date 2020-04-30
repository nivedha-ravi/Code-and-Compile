/*
INPUT:
Apple Guava Fig
OUTPUT:
yes
Explanation:
In the given string,Apple Guava Fig, the last character of the each word is equal to the previous word.
[Case-insensitive comparison is done here]
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] st=str.split(" ");
		int flag=0;
		for(int i=0;i<st.length-1;i++)
		{   char ch[]=st[i].toCharArray();
		    char ch1[]=st[i+1].toCharArray();
		    if(Character.toLowerCase(ch[0])==Character.toLowerCase(ch1[ch1.length-1]))
		    {
		        flag=1;
		    }
		    else
		    {
		        flag=0;
            break;
		    }
		}
		if(flag==0)
		{
		    System.out.print("no");
		}
		else
		{
		    System.out.print("yes");
		}

	}
}
