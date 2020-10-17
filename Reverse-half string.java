/*
Example Input/Output 1:
Input:
argument
Output:
guarntme
Explanation:
After reversing the first half and the second half of the string argument, the string becomes ugratnem.
After reversing the first half and the second half in the first half of the string ugratnem, the string becomes guartnem.
After reversing the first half and the second half in the second half of the string guartnem, the string becomes guarntme.
So guarntme is printed as the output.
*/
import java.util.*;
public class Hello {
    public static void reverse(char[] a,int start,int end)
    {
        for(int i=start,j=end-1;i<j;i++,j--)
        {
           char ch=a[i];
           a[i]=a[j];
           a[j]=ch;
        }
    }
    public static void splitandreverse(char[] s,int start,int end)
    {
        int len=0;
        char str[]=new char[101];
        for(int i=start;i<end;i++)
        {
            str[len++]=s[i];
        }
        reverse(str,0,len/2);
        if(len%2==0)
        {
            reverse(str,len/2,len);
        }
        else
        {
            reverse(str,(len/2)+1,len);
        }
        len=0;
        for(int i=start;i<end;i++)
        {
            s[i]=str[len++];
        }
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.nextLine().toCharArray();
		int len=s.length;
		int mid=(len%2==0)?len/2:(len/2)+1;
		reverse(s,0,len/2);
		reverse(s,mid,len);
		splitandreverse(s,0,len/2);
		splitandreverse(s,mid,len);
		System.out.print(new String(s));

	}
}
