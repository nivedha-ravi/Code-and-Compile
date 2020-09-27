/*
Example Input/Output 1:
Input:
2
09:52 11:41
13:27 16:55
Output:
5 Hours 17 Minutes
Explanation: Here N = 2.
In the first record, the employee will be inside the office for 1 Hour and 49 Minutes.
In the second record, the employee will be inside the office for 3 Hours and 28 Minutes.
The total time the employee worked within the office is 5 Hours and 17 Minutes.
Hence the output is 5 Hours 17 Minutes
Example Input/Output 2:
Input:
3
08:00 11:42
12:15 14:50
15:45 17:15
Output:
7 Hours 47 Minutes
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            String s1[]=sc.next().split(":");
            String s2[]=sc.next().split(":");
            int a=Integer.parseInt(s1[0]);
            int b=Integer.parseInt(s1[1]);
            int c=Integer.parseInt(s2[0]);
            int d=Integer.parseInt(s2[1]);
            int h=a*60;
            int m=h+b;
            int h1=c*60;
            int m1=h1+d;
            sum+=(m1-m);
        }
        int hh=sum%60,mm=sum%60;
        if(hh==1)
		    System.out.print("1 Hour "+mm+" Minutes");
        else
        System.out.println(hh+" Hours "+mm+" Minutes");
	}
}
