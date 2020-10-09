/*
Example Input/Output 1:
Input:
apple
4
Output:
ppale
Explanation:
The given string is apple and the value of N is 4.
The multiples of 4 are 4, 8, 12, 16, 20, 24 and so on.
While traversing the string apple in circularly reverse order, the 4th character is p.
So the character p is printed and removed from the string apple.
Now the string becomes aple.
Then the 8th character in circularly reverse order is p.
So the character p is printed and removed from the string aple.
Now the string becomes ale.
Then the 12th character in circularly reverse order is a.
So the character a is printed and removed from the string ale.
Now the string becomes le.
Then the 16th character in circularly reverse order is l.
So the character l is printed and removed from the string le.
Now the string becomes e.
Finally, the remaining character e is printed and it is removed from the string.
Hence the output is ppale.
Example Input/Output 2:
Input:
Xyz#12345
5
Output:
15z23#X4y
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
	    int l=s.length();
	    int i=l-1;
	    int j=1;
		while(s.length()!=0){
		    if(j%n==0){
		        System.out.print(s.charAt(i));
		        s=s.substring(0,i)+s.substring(i+1);
		     }
		     i--;
		     j++;
		     if(i<0)
		       i=s.length()-1;
		}
	}
}

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		int n =sc.nextInt();n=n-1;
		StringBuffer sb =new StringBuffer(str);
		String s=sb.reverse().toString();
		char ch[]=s.toCharArray();
		ArrayList<Character> chList = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++){
		    chList.add(ch[i]);
		}
		String fi  ="";int i=0;
	  while(true){
	    if(fi.length()==ch.length){
	        break;
	    }
	    i=(i+n)%chList.size();
	   fi+=""+chList.get(i);
	   chList.remove(i);
	 }
	 System.out.print(fi);
	}
}
