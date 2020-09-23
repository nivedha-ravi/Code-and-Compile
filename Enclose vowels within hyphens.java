/*
Input:
NOTEBOOKPAPER
Output:
N-O-TEBOOKPAP-E-R
NOT-E-BOOKP-A-PER
NOTEB-O--O-KPAPER
NOTEB-O--O-KPAPER
NOT-E-BOOKP-A-PER
N-O-TEBOOKPAP-E-R
Explanation:
The number of vowels in the given string NOTEBOOKPAPER is 6. So 6 lines are printed in the output.
N-O-TEBOOKPAP-E-R NOT-E-BOOKP-A-PER NOTEB-O--O-KPAPER NOTEB-O--O-KPAPER NOT-E-BOOKP-A-PER N-O-TEBOOKPAP-E-R
*/
import java.util.*;
public class Hello {
    public static int isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] s=in.next().toCharArray();
		int len=s.length;
		int index[]=new int[s.length];
		int count=0,k=0;
		for(int i=0;i<len;i++)
		{
		    if(isVowel(s[i])==1)
		    {
		        count++;
		        index[k++]=i;
		    }
		}
		int l=0,m=k-1;
        for(int i=0;i<count;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(index[l]==j && isVowel(s[j])==1)
                {
                    System.out.print("-"+s[j]+"-");
                }
                else if(index[m]==j && isVowel(s[j])==1)
                {
                    System.out.print("-"+s[j]+"-");
                }
                else
                {
                    System.out.print(s[j]);
                }
            }
            l++;
            m--;
            System.out.println();
        }
	}
}
