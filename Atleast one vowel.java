/*
Input:
4
lion
TIGER
elEphant
Deer
Output:
yes
Explanation:
The number of vowels in the string lion is 2.
The number of vowels in the string TIGER is 2.
The number of vowels in the string elEphant is 3.
The number of vowels in the string Deer is 2.
Here all the 4 string values contain at least 1 vowel. Hence the output is yes
Example Input/Output 2:
Input:
5
Land
Earth
SKY
Water
FIRE
Output:
no
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int j=0;j<n;j++)
		{
		    String str=in.next();
		    str=str.toLowerCase();
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		        {
		            count++;
		            break;
		        }
		    }
		}
		System.out.print((count==n)?"yes":"no");


	}
}
