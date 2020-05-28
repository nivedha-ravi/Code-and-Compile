*/
In a college, each student receives marks M in any of the subjects in the range from 0 to 100.
- If the difference between the marks and the next multiple of 5 is less than 3, then round the marks up to the next multiple of 5.
- If the difference between the marks and the next multiple of 5 is more than or equal to 3, then leave the marks as it is.
- If the marks obtained is less than or equal to 37, then leave the marks as it is.
Input Format:
The first line will contain the value of N which represents the count of the test cases.
Next N lines will contain the marks from M(1) to M(N)
Output Format:
N lines containing the rounded marks value, one line each for the marks from M(1) to M(N)
Constraints:
2 <= N <= 100
Example Input/Output 1:
Input:
4 83 57 48 33
Output:
85 57 50 33
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=in.nextInt();
		    if(a<=37)
		    {
		        System.out.println(a);
		    }
		    else if(a>37)
		    {
		        int c=a;
		        while(a%5!=0)
		        {
		            a++;
		        }
		        if(a-c<3)
		        {
		            System.out.println(a);
		        }
		        else
		        {
		            System.out.println(c);
		        }
		    }
		}

	}
}
