/*
Example Input/Output 1:
Input: 5 4 7
Output:
5 2
4 3
3 4
Explanation: Here N=7, the all possible combinations of getting 7 balls from the 5 red balls and the 4 blue balls are given below.
5 2
4 3
3 4
Example Input/Output 2:
Input: 13 10 4
Output:
4 0
3 1
2 2
1 3
0 4
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int r,b,c;
		r=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		for(int i=r;i>=0;i--)
		{
		    int j=c-i;
		    if(j>=0 && j<=b)
		    {
		        System.out.println(i+" "+j);
		    }
		}
	}
}
