/*
INPUT:
skillrack
OUTPUT:
[sk]i[llr]a[ck]
INPUT:
aeroplane
OUTPUT:
ae[r]o[pl]a[n]e
*/
import java.util.*;
public class Hello {
    public static int isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		    if(isVowel(ch[i])==1)
		    {
		        System.out.print(ch[i]);
		    }
		    else if(isVowel(ch[i])==0)
		    {
		        System.out.print("[");
		        int j;
		       for(j=i;j<ch.length;j++)
		       {
		           if(isVowel(ch[j])==0)
		           {
		               System.out.print(ch[j]);
		           }
		           if(isVowel(ch[j])==0 && j==ch.length()-1)
		           {
		               System.out.print("]");
		           }
		           if(isVowel(ch[j])==1)
		           {
		               System.out.print("]"+ch[j]);
		               break;
		           }
		       }
		       i=j;
		    }
		}

	}
}
