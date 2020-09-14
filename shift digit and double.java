/*
Example Input/Output 1:
Input: 123456
Output: 326508
Explanation:
In the given integer 123456, the digits in even positions are 2, 4, 6.
After shifting the digits in even positions for 1 time to the right, the integer becomes 163254.
After doubling the integer value, the integer becomes 326508 (2x163254).
Hence the output is 326508
Example Input/Output 2:
Input: 789335467
Output: 1539666914
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length,k=0;
        String e=new String(s);
        ArrayList<Character> a=new ArrayList<Character>();
        for(int i=0;i<l;i++){
            if(i%2!=0){
                a.add(s[i]);
            }
        }
        Collections.rotate(a,1);
        String d="";
        for(int i=0;i<l;i++){
           if(i%2!=0){
               s[i]=a.get(k++);
           }
           d+=s[i];
        }
        System.out.print(Long.parseLong(d)*2);
	  }
}
