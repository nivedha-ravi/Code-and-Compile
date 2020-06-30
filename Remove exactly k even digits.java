/*
Example Input/Output 1:
Input:
5 7
1963 2937 544 2673 2350
Output:
1558
Explanation:
Here K = 7. After removing the first 7 even digits, the integers become 193, 937, 5, 73 and 350. So their sum 1558 (193 + 937 + 5 + 73 + 350 = 1558) is printed as the output.
Example Input/Output 2:
Input:
4 6
657 824 509 2001
Output:
117
Explanation: After removing the first 6 even digits, the integers become 57, 59 and 1 (001 is equal to 1). So their sum 117 (57 + 59 + 1 = 117) is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		long sum=0L;
		for(int i=0;i<n;i++)
		{
		    char[] a=in.next().toCharArray();
		    String s="";
		    for(int j=0;j<a.length;j++)
		    {
		        if((a[j]-'0')%2==0 && count!=k)
		        {
		            count++;
		        }
		        else
		        {
		            s+=a[j];
		        }
		    }
		    if(s.length()!=0)
		    {
		    int num=Integer.parseInt(s);
		    sum+=num;
		    }
		}
		System.out.print(sum);

	}
}
