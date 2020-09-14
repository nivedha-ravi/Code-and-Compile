/*
Example Input/Output 1:
Input: 5
12 34 31 867 92
Output:
12 34 867
Explanation:
The digital sum of 12 is 3, which is an odd integer. So 12 is printed as the output.
The digital sum of 34 is 7, which is an odd integer. So 34 is printed as the output.
The digital sum of 31 is 4, which is an even integer. So 31 is NOT printed.
The digital sum of 867 is 3, which is an odd integer. So 867 is printed as the output.
The digital sum of 92 is 2, which is an even integer. So 92 is NOT printed.
Example Input/Output 2:
Input: 4
11 22 33 454
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        int p=0;
        for(int i=0;i<n;i++){
            long s=Sum(a[i]);
            if(s%2!=0){
                System.out.print(a[i]+" ");
                p=1;
            }
        }
        if(p==0) System.out.print(-1);
	}
	public static long Sum(long a){
	    long sum1=0;
	    while(a>0){
	        sum1+=(a%10);
	        a/=10;
	    }
	    if(sum1>=10) sum1=Sum(sum1);
	    return sum1;
	}
}
