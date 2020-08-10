/*
Example Input/Output 1:
Input: SkillRack
Output: ikacRllkS
Explanation:
The vowels in the string SkillRack are i and a.
The consonants in the string SkillRack are S, k, l, l, R, c and k.
After interlacing the vowels (in the order of their occurrence) with the consonants (in the reverse order of their occurrence), the string becomes ikacRllkS.
So ikacRllkS is printed as the output.
Example Input/Output 2:
Input: Heaven
Output: enaveH
Example Input/Output 3:
Input: AEIOU
Output: AEIOU
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		ArrayList<Character> vowel=new ArrayList<>();
		ArrayList<Character> consonant=new ArrayList<>();
		for(char ch:sc.nextLine().toCharArray()){
		    if("AEIOUaeiou".contains(ch+"")){
		        vowel.add(ch);
		    }
		    else
		    {
		        consonant.add(ch);
		    }
		}
		Collections.reverse(consonant);
		int maxLen=Math.max(vowel.size(),consonant.size());
		for(int index=0;index<maxLen;index++){
		    if(index<vowel.size()){
		        System.out.print(vowel.get(index));
		    }
		    if(index<consonant.size()){
		        System.out.print(consonant.get(index));
		    }
		}

	}
}

import java.util.*;
public class Hello {
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int l=s.length;
        String vow="",con="";
        for(int i=0,j=l-1;i<l && j>=0;i++,j--){
            if(isVowel(s[i])){
                vow+=s[i];
            }
            if(!(isVowel(s[j]))){
                con+=s[j];
            }
        }
        for(int i=0,j=0;i<vow.length() || j<con.length();i++,j++){
            if(i<vow.length())
            System.out.print(vow.charAt(i));
            if(j<con.length())
            System.out.print(con.charAt(j));
        }
	}
}
