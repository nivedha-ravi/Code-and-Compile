/*
Example Input/Output 1:
Input:
10:30
12:00
12:45
Output:
14:15
Explanation:
Here C1 = 10:30, C2 = 12:00 and T = 12:45.
The difference between 10:30 and 12:00 is 1 Hour and 30 Minutes.
If C1 shows 12:45, then C2 shows 14:15.
So 14:15 is printed as the output.
Example Input/Output 2:
Input:
05:20
22:23
09:30
Output:
02:33
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c1[]=sc.next().split(":"),c2[]=sc.next().split(":"),t[]=sc.next().split(":");
        int h1=Integer.parseInt(c1[0]),h2=Integer.parseInt(c2[0]),h3=Integer.parseInt(t[0]);
        int m1=Integer.parseInt(c1[1]),m2=Integer.parseInt(c2[1]),m3=Integer.parseInt(t[1]);
        int a=(h1*60)+m1,b=(h2*60)+m2;
        int dif=Math.abs(a-b)+((h3*60)+m3);
        System.out.printf("%02d:%02d",(dif/60)%24,(dif%60));
	}
}
