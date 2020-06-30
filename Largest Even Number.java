/*
A string S which contains digits as well as non-digits is passed as the input.
The program has to find the largest even number E that can be formed from the available digits after removing the duplicates(removing repeated digits).
If it is not possible to form an even number then the program must print -1.
Boundary Condition(s): 1 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains E or -1.
Example Input/Output 1:
Input:
%#36%#%6ab66
Output:
36
Explanation:
After removing duplicates we have 3 and 6. So 36 is the largest even number that can be formed.
Example Input/Output 2:
Input:
%e#2393#@i
Output:
932
Example Input/Output 3:
Input:
%e#5393#@i
Output:
-1
Example Input/Output 4:
Input:
%e#66#@66666i
Output:
6
Example Input/Output 5:
Input:
%e#66#@6600666i007
Output:
760
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.nextLine().toCharArray();
		Set<Integer> dig=new HashSet<Integer>();
		for(int i=0;i<ch.length;i++)
		{
		    if(Character.isDigit(ch[i]))
		    {
		        dig.add(Character.getNumericValue(ch[i]));
		    }
		}
	    ArrayList<Integer> diglist=new ArrayList<Integer>(dig);
	    Collections.sort(diglist,Collections.reverseOrder());
	    int len=diglist.size();
	    boolean evenDigitFound=false;
	    for(int i=len-1;i>=0;i--)
        {
            int digit=diglist.get(i);
            if(digit%2==0)
            {
                diglist.remove(i);
                diglist.add(digit);
                evenDigitFound=true;
                break;
            }
        }
        if(evenDigitFound==false)
        {
        System.out.print("-1");
        }
        else
        {
            for(Integer d:diglist)
            {
                System.out.print(d);
            }
        }


	}
}
