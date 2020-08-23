/*
Example Input/Output 1:
Input:
hi runout the onion
Output:
ih tuonur the onion
Explanation:
The word hi contains equal number of vowels(1) and consonants(1).
So it is reversed as ih.
The word runout contains equal number of vowels(3) and consonants(3).
So it is reversed as tuonur.
The word the not contains equal number of vowels(1) and consonants(2).
So it is kept as it is.
The word onion not contains equal number of vowels(3) and consonants(2).
So it is kept as it is.
Hence the output is ih tuonur the onion
Example Input/Output 2:
Input:
CODE BLOCKS
Output:
EDOC BLOCKS
*/

import java.util.*;
public class Hello {
    public static boolean isVow(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[]=sc.nextLine().split(" ");
        int l=a.length;
        for(int i=0;i<l;i++){
            String s=a[i];
            int vow=0,cons=0;
            for(int j=0;j<s.length();j++){
                if(isVow(s.charAt(j)))
                    vow++;
                else
                    cons++;
            }
            StringBuilder sb=new StringBuilder(s);
            if(vow==cons){
                System.out.print(sb.reverse().toString()+" ");
            }else{
                System.out.print(s+" ");
            }
        }
	}
}
