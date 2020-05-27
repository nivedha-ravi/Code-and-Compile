/*
The program is provided with one or more strings separated by a comma, where each string is associated with an integer following it after a colon (:).
If the sum of the squares of the digits of the associated integer is even then rotate the string right by one position.
If the sum of the squares of the digits of the associated integer is odd then rotate the string left by two positions.
Boundary Condition(s):
1 <= Count of String Values <= 20
Input Format:
The first line contains the string values separated by a comma.
Output Format:
The lines contain the string values rotated based on the given conditions.
Example Input/Output 1:
Input:
abcde:234,pqrs:246
Output:
cdeab
spqr
Explanation:
For abcde, the integer is 234. The sum of squares of the digits is 4+9+16=29 which is odd.
So abcde is rotated left by two positions resulting in cdeab.
For pqrs, the integer is 246. The sum of squares of the digits is 4+16+36=56 which is even.
So abcde is rotated right by one position resulting in spqr.
Example Input/Output 2:
Input:
xyz:193
Output:
zxy
/*
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] st=s.split(",");
		for(int i=0;i<st.length;i++)
		{
		    String str[]=st[i].split(":");
		    int n=Integer.parseInt(str[1]);
		    int sum=0;
		    while(n>0)
		    {
		        sum=sum+(n%10)*(n%10);
		        n/=10;
		    }
		    int len=str[0].length();
		    if(sum%2==0)
		    {
		        System.out.print(str[0].substring(len-1,len));
		        System.out.println(str[0].substring(0,len-1));
		    }
		    else
		    {
		        System.out.print(str[0].substring(2,len));
		        System.out.println(str[0].substring(0,2));
		    }

		}

	}
}
