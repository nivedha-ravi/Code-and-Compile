/*
Example Input/Output 1:
Input: 35
Output: 29
Explanation:
Here N = 35.
The sum of digits in 35 is 8.
The maximum possible integer X which is less than 35 and having the sum of digits greater than 8 is 29.
So 29 is printed as the output.
Example Input/Output 2:
Input: 48
Output: 48
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long t=n,sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        long i1=0,in=0;
        for(long i=t;i>=0;i--){
            i1=i;
            long d=0;
            while(i1>0){
                d+=(i1%10);
                i1/=10;
            }
            if(d>sum){
                in=i;
                break;
            }
        }
        if(in==0)
        System.out.print(t);
        else
        System.out.print(in);
	}
}
