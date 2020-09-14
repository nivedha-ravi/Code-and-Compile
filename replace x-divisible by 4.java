/*
Example Input/Output 1:
Input: 6447X
Output: 64472 64476
Explanation: Here N = 6447X.
The two possible numbers divisible by 4 are 64472 and 64476.
Example Input/Output 2:
Input: 246X
Output: 2460 2464 2468
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=s.substring(0,s.length()-1);
        for(int i=0;i<10;i++){
            Long n=Long.parseLong(a+i);
            if(n%4==0)
            System.out.print(d+" ");
        }
	  }
}
