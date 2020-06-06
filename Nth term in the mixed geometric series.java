/*
The program must accept an integer N as the input. The program must print the Nth term in the series as the output.
NOTE: The order of series must be 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187, 256, 6561, 512, 19683, ...
This series is a mixture of 2 series - all the odd terms in this series form a geometric series and all the even terms form another geometric series.
Boundary Condition(s):
1 <= N <= 30
Input Format:
The first line contains the value of N .
Output Format:
The first line contains the Nth term in the series.
Example Input/Output 1:
Input:
3
Output:
2
Example Input/Output 2:
Input:
21
Output:
1024
1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 can represented as :

2(0), 3(0),2(1), 3(1),2(2), 3(2),2(3), 3(3),2(4), 3(4),2(5), 3(5),2(6), 3(6) ….
There are two consecutive sub GP’s at even and odd positions

(GP-1) At Odd Positions (Powers of 2) – 1, 2, 4, 8, 16, 32, 64, 128
(GP-2) At Even Positions (Powers of 3) – 1, 3, 9, 27, 81, 243, 729, 2187
Clearly, for calculating Nth position value

If N is Even, Find (N/2) position in sub GP – 2
If N is Odd, Find (N/2 + 1) position in sub GP – 1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print((n%2==0)?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));

	}
}
