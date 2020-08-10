/*
Example Input/Output 1:
Input: 52124
Output: 12452
Explanation:
All possible integers which are obtained by shifting the digits to the left in 52124 are given below.
52124
21245
12452
24521
45212
Here the smallest integer is 12452, so it is printed as the output.
Example Input/Output 2:
Input: 201
Output: 12
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length;
        int k=0;
        long a[]=new long[l];
        for(int i=0;i<l;i++){
            String d="";
            for(int j=i;j<i+l;j++){
                d+=s[j%l];
            }
            a[k++]=Long.parseLong(d);
        }
        long c=a[0];
        for(int i=0;i<k;i++){
            c=Math.min(c,a[i]);
        }
       System.out.print(c);
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = Integer.parseInt(s);
		for(int i=0;i<s.length();i++)
		{
		    char ch = s.charAt(0);
		    s = s.substring(1,s.length())+ch;
		    if(Integer.parseInt(s)<min)min=Integer.parseInt(s);
		}
		System.out.print(min);
	}
}
