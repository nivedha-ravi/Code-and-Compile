/*
INPUT:
ABCDEFGHIJKLMNO
PQRSTUVWXYZ
OUTPUT:
YES
INPUT:
FEDCBA
GHIJKLMNOPQRSTUVWXYZ
OUTPUT:
YES
input:
CBADEFGHIjKL
MNOPQRSTuvwXYZ
OUTPUT:
NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=in.nextLine();
		char[] c=s.toCharArray();
		char[] ch=s1.toCharArray();
		int alphacount[]=new int[26],l1=c.length,l2=ch.length;
		for(int i=0;i<l1;i++)
		{
		    if(Character.isUpperCase(c[i]))
		        alphacount[c[i]-'A']++;
		}
		 for(int j=0;j<l2;j++)
		{
		   if(Character.isUpperCase(ch[j]))
		        alphacount[ch[j]-'A']++;
		}
		for(int i=0;i<26;i++)
		{
		    if(alphacount[i]!=1)
		    {
		        System.out.print("NO");
		        System.exit(1);
		    }
		}
		System.out.print("YES");

	}
}
