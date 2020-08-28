/*
Example Input/Output 1:
Input:
Welcome to skillrack
Output:
Welcome skillrack to
Explanation:
Here S = "Welcome to skillrack". After sorting the words based on the last character, the string becomes "Welcome skillrack to". Hence the output is Welcome skillrack to
Example Input/Output 2:
Input:
WE WENT TO THE TEMPLE YESTERDAY
Output:
WE THE TEMPLE TO WENT YESTERDAY
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s=in.nextLine().split(" ");
		for(int i=0;i<s.length;i++)
		{
		    for(int j=0;j<s.length-1;j++)
		    {
		        if(s[j].charAt(s[j].length()-1)>s[j+1].charAt(s[j+1].length()-1))
		        {
		            String temp=s[j];
		            s[j]=s[j+1];
		            s[j+1]=temp;
		        }
		    }

		}
		for(String i:s)
		{
		    System.out.print(i+" ");
		}

	}
}
