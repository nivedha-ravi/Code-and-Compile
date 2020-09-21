/*
Example Input/Output 1:
Input: 25
Output: 10101111010101
Explanation:
Here N = 25, the binary representation of 25 is 11001.
After replacing the consecutive 0s in 11001 with the number of times it is repeated consecutively, it becomes 11221.
The binary representation of 11221 is 10101111010101.
So 10101111010101 is printed as the output.
Example Input/Output 2:
Input: 274
Output: 111111100100010111011010011
Explanation:
Here N = 274, the binary representation of 274 is 100010010.
After replacing the consecutive 0s in 100010010 with the number of times it is repeated consecutively, it becomes 133312211.
The binary representation of 133312211 is 111111100100010111011010011.
So 111111100100010111011010011 is printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String st=Integer.toBinaryString(n);
		char[] s=st.toCharArray();
		for(int i=0;i<s.length;i++)
		{
		    int count=0,start=0;
		    for(int j=i+1;j<s.length;j++)
		    {
		        if(s[i]==s[j])
		        {
		            if(s[i]=='0')
		            {
		                count++;
		            }
		            if(count==1)
		            {
		                start=j-1;
		            }
		        }
		        else
		        {
		            if(count>0)
		            {
		                for(int k=start;k<j;k++)
		                {
		                    s[k]=(char)((count+1)+'0');
		                }
		            }
		            break;
		        }
		    }
		}
		for(int i=0;i<s.length-1;i++)
		{
		    if(s[i]=='0' && s[i+1]!='0')
		    {
		        s[i]='1';
		    }
		}
		int f=0;
		for(int i=0;i<s.length;i++)
		{
		    if(s[i]=='0')
		    {
		        f++;
		    }
		}
		for(int i=0;i<s.length;i++)
		{
		    if(s[i]=='0')
		    {
		        s[i]=(char)(f+'0');
		    }
		}
		String str=new String(s);
		long num=Long.parseLong(str);
		System.out.print(Long.toBinaryString(num));

	}
}
