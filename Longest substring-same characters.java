/*
Example Input/Output 1:
Input:
aaabbccc
Output:
aaa ccc
Explanation:
In the given string aaabbccc, the longest possible substring values that are formed using a character are aaa and ccc.
Hence the output is aaa ccc
Example Input/Output 2:
Input:
XXyyyy33333xxxZZzzzAaAaA
Output:
33333 ZZzzz AaAaA
Example Input/Output 3:
Input:
pqrs@87
Output: -1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int k=0,max=0;
        String a[]=new String[s.length];
        for(int i=0;i<s.length;i++){
            String r="";
            if(s[i]!=' '){
                r+=s[i];
                for(int j=i+1;j<s.length;j++){
                    char e=s[j];
                    if(Character.toLowerCase(s[i])==Character.toLowerCase(s[j])){
                        r+=e;
                        s[j]=' ';
                    }else{
                        break;
                    }
                }
                a[k++]=r;
            }
        }
        for(int i=0;i<k;i++){
            if(a[i].length()>max){
                max=a[i].length();
            }
        }
        int p=0;
        for(int i=0;i<k;i++){
            if(a[i].length()==max && a[i].length()>1){
                System.out.print(a[i]+" ");
                p=1;
            }
        }
        if(p==0) System.out.print("-1");
	}
}
