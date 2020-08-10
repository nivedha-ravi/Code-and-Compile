/*
Example Input/Output 1:
Input: 10
Output: 3
Explanation: Here N = 10.
The number of bits in the binary representation of 10 is 4.
So the number of bits to consider to find the first bit is 4.
The binary representation of the integers from 1 to 10 are given below.
0001
0010
0011
0100
0101
0110
0111
1000
1001
1010
There are three binary representations having 1 as the first bit (1000, 1001 and 1010).
So 3 is printed as the output.
Example Input/Output 2:
Input: 16
Output: 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String ori=Long.toBinaryString(n);
        int l=ori.length(),count=0;
        for(long i=0;i<=n;i++){
            String s=Long.toBinaryString(i);
            String fin="";
            if(s.length()<l){
                for(int j=0;j<l-s.length();j++){
                    fin+=0;
                }
            }
            fin+=s;
            if(fin.charAt(0)=='1'){
                count++;
            }
        }
        System.out.print(count);
	}
