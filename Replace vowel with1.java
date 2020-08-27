/*
Example Input/Output 1:
Input: AeFloT
Output: 11Fl1T 3
Explanation:
The count of vowels in the string AeFloT is 3 and they are A, e and o.
After replacing the vowels with 1, the string becomes 11Fl1T.
Hence the output is 11Fl1T 3
Example Input/Output 2:
Input: AB1E
Output: Invalid
*/

import java.util.*;
public class Hello {
    public static boolean isVow(char a){
        if(a=='a' || a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='O'||a=='I'||a=='U'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        String s="";
        int c=0;
        for(int i=0;i<a.length;i++){
            if(isVow(a[i])){
                s+=1;
                c++;
            }else if(Character.isLetter(a[i])){
                s+=a[i];
            }else{
                System.out.print("Invalid");
                return;
            }
        }
        System.out.print(s+" "+c);
	}
}
