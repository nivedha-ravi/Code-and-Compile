/*
Example Input/Output 1:
Input: 34
Output: aDCBbA
Explanation: The binary representation of 34 is 100010.
After replacing all the 1's by the lower case alphabets from 'a' (left to right), the binary representation becomes a000b0.
After replacing all the 0's by the upper case alphabets from 'A' (right to left), the binary representation becomes aDCBbA.
Hence the output is aDCBbA
Example Input/Output 2:
Input: 19
Output: aBAbc
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String a1=Integer.toBinaryString(s);
        char[] a=a1.toCharArray();
        char c1='a';
        char c2='A';
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]=='1'){
                a[i]=c1++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]=='0'){
                a[i]=c2++;
            }
        }
        System.out.print(a);
	}
}
