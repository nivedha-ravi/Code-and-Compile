/*
Substring Vowel Count
The program must accept a string S that contains only alphabets and print all the substring values and the count of the vowels in them.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The L*(L+1) lines contain the substring values and the count of vowels in each substring (L is the length of the string).
Example Input/Output 1:
Input:
eagle
Output:
e 1
ea 2
eag 2
eagl 2
eagle 3
a 1
ag 1
agl 1
agle 2
g 0
gl 0
gle 1
l 0
le 1
e 1
Example Input/Output 2:
Input:
TEA
Output:
T 0
TE 1
TEA 2
E 1
EA 2
A 1
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
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int len=s.length();
		int vowelcount[]=new int[len];
		int vowels=0;
		for(int i=0;i<len;i++)
		{
		    if(isVowel(s.charAt(i))==1)
		    {
		        vowels++;
		    }
		    vowelcount[i]=vowels;
		}
		for(int from=0;from<len;from++)
		{
		    for(int to=from;to<len;to++)
		    {
		        int vc=vowelcount[to]-((from==0)?0:vowelcount[from-1]);
		        System.out.println(s.substring(from,to+1)+" "+vc);
		    }
		}


	}
}
