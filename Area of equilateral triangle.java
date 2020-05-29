/*
Example Input/Output 1:
Input:
5
Output:
10.83
Explanation:
Here the side S = 5. The area of the equilateral triangle with the precision up to two decimal places is printed as the output. So 10.83 is printed.
Example Input/Output 2:
Input:
18
Output:
140.30
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double n=in.nextDouble();
		double a=Math.sqrt(3)/4*n*n;
		System.out.format("%.2f",a);


	}
}
