/*
Example Input/Output 1:
Input: 6
Output: 8
Explanation: Here N = 6.
The binary representation of 6 is 110 (2 consecutive 1s).
The binary representation of 7 is 111 (3 consecutive 1s).
The binary representation of 8 is 1000 (NO consecutive 1s).
So 8 is printed as the output.
Example Input/Output 2:
Input: 9
Output: 9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long k=n;;k++){
            int i=0;
            char s[]=Long.toBinaryString(k).toCharArray();
            for(i=0;i<s.length-1;i++){
                if(s[i]=='1' && s[i]==s[i+1])
                    break;
            }
            if(i==s.length-1){
                System.out.print(k); break;
            }
        }
	  }
}
