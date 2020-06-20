/*
Example Input/Output 1: Input: 6 Output: 23
Explanation: The 6th integer with the prime digits is 23. Hence the output is 23
Example Input/Output 2: Input: 11 Output: 35
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int c=0;
		   for(int j=2;;j++)
		   {
		       int a=j,count=0,ct=0;
		       while(a>0)
		       {
		          ct++;
		           if(a%10==2||a%10==3||a%10==5||a%10==7)
		           {
		               count++;
		           }
		           a/=10;
		       }
		       if(count==ct)
		       {
		           c++;
		       }
		       if(c==n)
		       {
		           System.out.print(j);
		           break;
		       }
		   }


	}
}
