/*
Example Input/Output 1:
Input:
1 4
7
21
13 17
Output:
25
6
16
Explanation:
First Term = 1. Common Difference = 4. The integers in the arithmetic progression are 1, 5, 9, 13, 17, 21, 25 and so on.
The 7th term in the arithmetic progression is 25. So 25 is printed in the first line.
The position of the term 21 in the arithmetic progression is 6. So 6 is printed in the second line.
The absolute difference between the 13th term and the 17th term is 16 (49 - 65). So 16 is printed in the third line.
Example Input/Output 2:
Input:
0 -3
3 -14
4
7
Output:
-6
Not Found
9
*/ 
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int f=in.nextInt();
		int d=in.nextInt();
		int n=in.nextInt();
		int t=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		System.out.println(f+(n-1)*d);
		System.out.println((t-f+d)/d);
		System.out.print(Math.abs((f+(x-1)*d)-(f+(y-1)*d)));

	}
}
