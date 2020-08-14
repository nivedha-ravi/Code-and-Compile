/*
Example Input/Output 1:
Input:
08:12:15
12:34:55
Output:
04:22:40
Explanation:
The entry time of the employee is 08:12:15.
The exit time of the employee is 12:34:55.
The difference between the entry time and the exit time is 04:22:40.
So 04:22:40 is printed as the output.
Example Input/Output 2:
Input:
09:30:55
11:12:15
Output:
01:41:20
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] s1=in.next().split(":");
		String[] s2=in.next().split(":");
		int h1=Integer.parseInt(s1[0]);
		int h2=Integer.parseInt(s2[0]);
		int m1=Integer.parseInt(s1[1]);
		int m2=Integer.parseInt(s2[1]);
		int sec1=Integer.parseInt(s1[2]);
		int sec2=Integer.parseInt(s2[2]);
		int start=(h1*60*60)+(m1*60)+sec1;
		int end=(h2*60*60)+(m2*60)+sec2;
		int total=Math.abs(end-start);
		int hour=0,min=0;
		if(total>=3600)
		{
		    hour+=total/3600;
		    total=total%3600;
		}
		if(total>=60)
		{
		    min+=total/60;
		    total=total%60;
		}
		int second=total;
		System.out.format("%02d:%02d:%02d",hour,min,second);

	}
}
