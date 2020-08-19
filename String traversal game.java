/*
Example Input/Output 1:
Input:
cat
dog
Output:
tgoacd
Explanation:
Here S1 = "cat" and S2 = "dog" .
The game always starts from the last character of S1.
So the first character traversed in the game is t.
Then compare the characters at the same position(3). Here both are consonants(t, g).
So the second character traversed in the game is g.
Then the only possible way to traverse is moving towards left.
So the third character traversed in the game is o.
Then compare the characters at the same position(2).Here both are vowels(o, a).
So the fourth character traversed in the game is a.
Then the only possible way to traverse is moving towards left.
So the fifth character traversed in the game is c.
Then compare the characters at the same position(1). Here both are consonants(c, d).
So the sixth character traversed in the game is d.
So tgoacd is printed as the output.
Example Input/Output 2:
Input:
SKILLRACK
BACDFEGHJ
Output:
KJHCARLFDLIKSB
*/

import java.util.*;
public class Hello {
    static boolean isVow(char a){
        a=Character.toLowerCase(a);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray(),b[]=sc.next().toCharArray();
        int l=a.length,p=0;
        for(int i=l-1;i>=0;i--){
            if((isVow(a[i]) && isVow(b[i]))||(!isVow(a[i]) && !isVow(b[i]))){
                if(p==0){
                    System.out.print(a[i]+""+b[i]);
                    p=1;
                }else{
                    System.out.print(b[i]+""+a[i]);
                    p=0;
                }
            }else{
                if(p==0){
                    System.out.print(a[i]);
                }else{
                    System.out.print(b[i]);
                }
            }
        }
	  }
}
