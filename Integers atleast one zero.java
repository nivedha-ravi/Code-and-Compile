/*
Input: 98 125
Output:
100 101 102 103 104 105 106 107 108 109 110 120
Explanation: Here X = 98 and Y = 125. The integers from 98 to 125 having at least one zero are 100 101 102 103 104 105 106 107 108 109 110 120. Hence the output is 100 101 102 103 104 105 106 107 108 109 110 120
Example Input/Output 2:
Input:
1351 1358
Output: -1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int flag=0;
		for(int i=x;i<=y;i++)
		{
		    int c=0,temp=i;
		    while(temp>0)
		    {
		        if(temp%10==0)
		        {
		            c++;
		            break;
		        }
		        temp/=10;
		    }
		    if(c==1)
		    {
		        System.out.print(i+" ");
		        flag=1;
		    }
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}

	}
}
