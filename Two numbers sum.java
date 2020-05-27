*/
The program must accept a list of numbers from 1 to 9, in which each number is separated by a comma.
The program must find the sum of two numbers.
These two numbers are needed to be calculated as per following rules.
1. First number should be calculated as : Add all the numbers that do not come between the first 5 and the first 8 in the input.
2. Second number should be calculated as : Append all the numbers to each other that comes between the first 5 and the first 8 (inclusive).
Finally, the program must print the sum of both the numbers as the output.
Note: 5 always comes before 8. Number of 5’s = Number of 8’s.
Boundary Condition(s):
1 <= Each integer value <= 9
Input Format:
The first line contains a list of numbers separated by a comma.
Output Format:
The first line contains the sum of two numbers as per the given conditions.
Example Input/Output 1:
Input:
3,4,5,2,7,9,8,3,2
Output:
52810
Explanation:
The numbers that do not come between 5 and 8 are 3, 4, 3 and 2 and their sum is 12.
The numbers that come between 5 and 8 (inclusive of 5 and 8) are 5,2,7,9 and 8.
After concatenation the number becomes 52798. The sum of 12 and 52798 is 52810.
Example Input/Output 2:
Input:
6,9,5,8,2
Output:
75
Example Input/Output 3:
Input:
1,6,5,5,3,2,8,9,1,8
Output:
55353
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		str=str.replaceAll("\\p{Punct}","");
		char ch[]=str.toCharArray();
		int i=str.indexOf('5');
		int j=str.indexOf('8');
		int diff=j-i;
		int sum1=0;
		String sum2="";
		for(int k=0;k<ch.length;k++)
		{
		    if(k==i)
		    {   if(diff==0)
		    {
		        sum2+=ch[i];
		        sum2+=ch[j];
		    }else
		    {
		        for(int l=i;l<=j;l++)
		    {
		        sum2=sum2+ch[l];

		    }
		    }
		    k=k+diff;
		    }
		    else
		    {sum1=sum1+Character.getNumericValue(ch[k]);
		    }
		}
		long sum3=Long.valueOf(sum2);
		System.out.print(sum1+sum3);



	}
}
