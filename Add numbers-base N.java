Two numbers X and Y are provided with reference to base N.
Add the numbers and print their sum with reference to base 10.
Input Format: First line will contain the value of N.
Second line will contain X and Y separated by one or more spaces.
Output Format: First line will contain the sum of X and Y to the base 10.
Boundary Conditions: 1 <= N <= 10
Example Input/Output 1:
Input: 2 1010 11
Output: 13
Explanation: 1010 to the base 2 is 10. 11 to the base 2 is 3. Hence the sum is 10+3 = 13.
Example Input/Output 2:
Input: 3 11 201
Output: 23
Explanation: 11 to the base 3 is 4. 201 to the base 3 is 19. Hence the sum is 23

JAVA CODE:
import java.util.*;

public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int n,sum,i,op=0;
		   String num,num1;
		    n=sc.nextInt();
            num=sc.next();
	        num1=sc.next();
 op=Integer.parseInt(num,n)+Integer.parseInt(num1,n);
		   System.out.println(op);

	}
  }
