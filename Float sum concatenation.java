/*
Example Input/Output 1:
Input:
4
31 481 686 83
Output:
718.311
Explanation:
Here N = 4 and the 4 integers are 31, 481, 686 and 83.
The float values 31.481 and 686.83 are formed by concatenating every two integers with a . (Dot) between them.
The sum of the two float values with the precision up to 3 decimal places is 718.311 (31.481 + 686.83).
So 718.311 is printed as the output.
Example Input/Output 2:
Input:
6
5 1 0 12 8 0
Output:
13.220
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<n-1;i+=2){
            String s=a[i]+"."+a[i+1];
            double f=Double.parseDouble(s);
            sum+=f;
        }
        System.out.printf("%.3f",sum);
	}
}
