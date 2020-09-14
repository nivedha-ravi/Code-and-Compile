/*
Example Input/Output 1:
Input:
A cup of tea
Output:
A cup
Explanation:
The given string is "A cup of tea" .
The word with the minimum length among the first word "A" and the last word "tea" is "A" .
The word with the maximum length among the second word "cup" and the last but one word "of" is "cup" .
Hence the output is A cup
Example Input/Output 2:
Input:
God helps those who help themselves
Output:
God helps who
Example Input/Output 3:
Input:
All good things must come to an end
Output:
All end good to must come
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int c=0;
        for(int i=0,j=s.length-1;i<j;i++,j--){
            c++;
            if(c%2==0){
                if(s[i].length()>s[j].length())
                System.out.print(s[i]+" ");
                else if(s[i].length()<s[j].length())
                System.out.print(s[j]+" ");
                else
                System.out.print(s[i]+" "+s[j]+" ");
            }else{
                if(s[i].length()>s[j].length())
                System.out.print(s[j]+" ");
                else if(s[i].length()<s[j].length())
                System.out.print(s[i]+" ");
                else
                System.out.print(s[i]+" "+s[j]+" ");
            }
        }
	  }
}
