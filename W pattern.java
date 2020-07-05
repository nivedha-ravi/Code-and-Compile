/*
Input:
TELEPHONE
ALERT
BRAVE
Output:
A***P***B
L**E*H**R
E*L***O*A
RE*****NV
T*******E
Explanation:
S1 = TELEPHONE
S2 = ALERT
S3 = BRAVE
Here R = 5 and C = 9 (The length of the shortest string "ALERT" or "BRAVE" is 5 and the length of the longest string "TELEPHONE" is 9). So the character matrix of size 5x9 is generated with asterisks.
*********
*********
*********
*********
*********
After rearranging the given string values, A = ALERT B = TELEPHONE C = BRAVE After modifying the matrix as per the given conditions, it becomes
A***P***B
L**E*H**R
E*L***O*A
RE*****NV
T*******E
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		String c=in.next();
		int l=a.length();
		int m=b.length();
		int n=c.length();
		int f=l;
		String large=a;
		if(m>l)
		{
		    f=m;
		    large=b;
		}
		if(n>l)
		{
		    f=n;
		    large=c;
		}
		int col=f;
		int r=(f/2)+1;
		String s1="",s2="",s3="";
		if(large==a)
		{
		    if(large.charAt(0)==b.charAt(m-1))
		    {
		        s1=b;
		        s3=c;
		    }
		    else if(large.charAt(0)==c.charAt(n-1))
		    {
		        s1=c;
		        s3=b;
		    }
		}
		else if(large==b)
		{
		    if(large.charAt(0)==a.charAt(l-1))
		    {
		        s1=a;
		        s3=c;
		    }
		    else if(large.charAt(0)==c.charAt(n-1))
		    {
		        s1=c;
		        s3=a;
		    }
		}
		else
		{
		    if(large.charAt(0)==a.charAt(l-1))
		    {
		        s1=a;
		        s3=b;
		    }
		    else if(large.charAt(0)==b.charAt(m-1))
		    {
		        s1=b;
		        s3=a;
		    }
		}
		s2=large;
		char ch[][]=new char[r][col];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        ch[i][j]='*';

		    }
		}
		int k=0;
		for(int i=0;i<r;i++)
		{
		    ch[i][0]=s1.charAt(k++);
		}
		 int x=0;
		 for(int i=0;i<r;i++)
		 {
		     ch[i][col-1]=s3.charAt(x++);
		 }
		 int z=s2.length()/2;
		 for(int i=0;i<r;i++)
		 {
		     for(int j=0;j<=col/2;j++)
		     {
		         if(i+j==r-1)
		         {
		            ch[i][j]=s2.charAt(z--);
		         }
		     }
		 }
		int d=s2.length()/2+1;
		for(int i=0;i<r;i++)
		{
		    for(int j=(col/2)+1;j<col;j++)
		    {
		        if(i+(col/2)+1==j+1)
		        {
		            ch[i][j]=s2.charAt(d++);
		        }
		    }
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        System.out.print(ch[i][j]);
		    }
		    System.out.println();
		}

	}
}
