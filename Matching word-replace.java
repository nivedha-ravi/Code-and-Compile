/*
Example Input/Output 1:
Input:
?i?n
LION crane lion breath kiln
Output:
lion
Explanation:
Here P = "?i?n" and S = "LION crane lion breath kiln" .
There are two words in S that match the pattern P.
lion klin
So the first occurring word lion is printed as the output.
Example Input/Output 2:
Input:
BR??E?
BRIGHT BEST BRAVE BROKEN
Output:
BROKEN
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        sc.nextLine();
        String a[]=sc.nextLine().split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].length()==s.length){
                char b[]=a[i].toCharArray();
                String d="";
                for(int j=0;j<s.length;j++){
                    if(s[j]=='?'){
                        d+=b[j];
                    }else if( b[j]==s[j]){
                        d+=s[j];
                    }
                }
                if(d.equals(a[i])){
                    System.out.print(d+" ");
                    break;
                }
            }
        }
	  }
}
