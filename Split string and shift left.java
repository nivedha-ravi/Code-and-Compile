/*
Boundary Condition(s):
2 <= Length of S <= 1000 2 <= K <= 100
Input Format:
The first line contains S and K separated by a space.
Output Format:
The lines containing the substrings of S based on the given conditions.
Example Input/Output 1:
Input:
technical 3
Output:
tec
nih
lca
Explanation:
Here S = technical and K = 3.
The substrings of S are tec, hni and cal.
The first substring is printed in the first line without any modification. tec
After shifting the characters in the second substring by 1 position, the second substring is printed in the second line. nih
After shifting the characters in the third substring by 2 positions, the third substring is printed in the third line. lca
Example Input/Output 2:
Input:
SKILLRACK 4
Output:
SKIL
RACL
K***
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt(),k=0;
        for(int i=0;i<s.length();i+=n){
            if(i+n<=s.length()){
                if(k+1>n) k=0;
                String a=s.substring(i,i+n);
                left(a,k);
                k++;
            }else{
                for(int j=i;j<s.length();j++){
                    System.out.print(s.charAt(j));
                }
                for(int j=0;j<n-(s.length()%n);j++){
                    System.out.print("*");
                }
            }
        }
	}
	public static void left(String s,int k){
	    String a=s.substring(k)+s.substring(0,k);
	    System.out.println(a);
	}
}


import java.util.*;
public class Hello {

    public static String remover(String str,int a){
        return str.substring(0,a)+str.substring(a+1);
    }

    public static void Substr(String a,int sep){
        for(int i=0;i<a.length();i+=sep){
            String strr;
            if (i+sep>=a.length()) {
               strr = a.substring(i);

            }
            else
            {
                strr = a.substring(i,i+sep);

            }

            for(int k=0;k<i/sep;k++){
                char s = strr.charAt(0);
                strr = remover(strr,0) + s;
            }
            if(strr.length() < sep){
                strr += "*".repeat((sep-strr.length()));
            }
            System.out.println(strr);
        }

    }

    public static void main(String[] args) {
		//Your Code Here
		String[] s;
		String str;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine().split(" ");
		int sep = Integer.parseInt(s[1]);
		str = s[0];
		Substr(str,sep);

	}
}
