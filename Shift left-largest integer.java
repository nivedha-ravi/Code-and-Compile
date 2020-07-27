/*
Example Input/Output 1: Input: 53 Output: 58 Explanation: The binary representation of 53 is 110101. After shifting the bits to the left by 1 position in the binary representation of 53, the binary representation becomes 101011. The decimal equivalent of 101011 is 43. Similarly, the remaining possible binary representations and their decimal equivalents are given below. 010111 - 23 101110 - 46 011101 - 29 111010 - 58 110101 - 53 Here the largest integer is 58. So it is printed as the output. Example Input/Output 2: Input: 16 Output: 16
import java.util.*;
*/
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toBinaryString(n);
		int max = 0;
		for(int i = 0;i < s.length(); i++) {
		    String k = s.substring(1)+s.charAt(0);
		    max = Math.max(max,Integer.parseInt(k,2));
		    s = k;
		}
    System.out.print(max);
	}
}
