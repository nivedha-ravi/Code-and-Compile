/*
Example Input/Output 1:
Input:
skillrack
Output:
[s]killrac[k]
[s][k]illra[c][k]
[s][k]i[l]l[r]a[c][k]
[s][k]i[l][l][r]a[c][k]
Explanation: Here S = "skillrack" .
The number of consonants in the string S is 7.
So (7+1)/2 lines are printed as the output.
In the first line, the 1st and 7th consonants are enclosed within the square brackets.
Now the string becomes [s]killrac[k].
In the second line, the 2nd and 6th consonants are enclosed within the square brackets.
Now the string becomes [s][k]illra[c][k].
In the third line, the 3rd and 5th consonants are enclosed within the square brackets.
Now the string becomes [s][k]i[l]l[r]a[c][k].
In the fourth line, the 4th consonant is enclosed within the square brackets.
Now the string becomes [s][k]i[l][l][r]a[c][k].
Example Input/Output 2:
Input:
Zombies
Output:
[Z]ombie[s]
[Z]o[m][b]ie[s]
*/

import java.util.*;
public class Hello {
    public static boolean isVowel(char a){
        a=Character.toLowerCase(a);
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,k,a=1,c=0,j;
		for(i=0;i<s.length();i++){
		    if(!isVowel(s.charAt(i)))
		    c++;
		}
		for(i=0;i<(c+1)/2;i++){
		    k=0;
		    for(j=0;j<s.length();j++){
		        if(!isVowel(s.charAt(j))){
		            k++;
		            if(k<=a||k>c-a)
		            System.out.print("["+s.charAt(j)+"]");
		            else
		            System.out.print(s.charAt(j));
		        }
		        else
		            System.out.print(s.charAt(j));
		    }
		    a++;
		    if(i!=((c+1)/2)-1)
		    System.out.println();
		}
	}
}
