/*
Example Input/Output 1:
Input:
DefeaT
Output:
{Def}eaT
Explanation:
The contiguous alphabets in the string DefeaT are D, e and f. So they are enclosed within a pair of curly braces. Hence the output is {Def}eaT
Example Input/Output 2:
Input:
stUdeNt
Output:
{stU}{de}Nt
Example Input/Output 3:
Input:
onnne
Output:
onnne
*/
import java.util.*;
public class Hello {
    public static void printBrackets(char[] ch,int start,int end)
    {
        int len=end-start+1;
        if(len>1)
        {
            System.out.print("{");
            while(start<=end)
            {
            System.out.print(ch[start++]);
            }
            System.out.print("}");
        }
        else
        {
            System.out.print(ch[start]);

        }
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int start=0,end=0;
		for(int i=1;i<ch.length;i++)
		{
		    if(Character.toLowerCase(ch[i])==Character.toLowerCase(ch[i-1]+1))
		    {
		        end=i;
		    }
		    else
		    {
		        printBrackets(ch,start,end);
		        start=end=i;
		    }
		}
		printBrackets(ch,start,end);
	}
}
