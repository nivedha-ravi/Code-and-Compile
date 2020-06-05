/*
The program must accept an integer X as the input.
The program must print the Xth term in the series as the output.
The order of series must be 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8 and so on.
All the odd terms in the above series represent the even integers in ascending order.
All the even terms in the above series are derived from its previous term T using the formula (T/2).
Boundary Condition(s):
1 <= X <= 10^18
Input Format:
The first line contains X.
Output Format:
The first line contains the Xth term in the above-mentioned series.
Example Input/Output 1:
Input:
5
Output: 4
Example Input/Output 2:
Input:
8
Output:
3
*/ 
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		System.out.print((n%2==0)?(n/2-1):n-1);

	}
}
