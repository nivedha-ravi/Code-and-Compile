/*
Example Input/Output 1:
Input:
abbbbcccdd
ppppqqrrrs
Output: yes
Explanation:
Here S1 = abbbbcccdd and S2 = ppppqqrrrs.
Frequency 1 -> a in S1 and s in S2.
Frequency 2 -> d in S1 and q in S2.
Frequency 3 -> c in S1 and r in S2.
Frequency 4 -> b in S1 and p in S2.
Both S1 and S2 have the same frequency pattern.
So yes is printed as the output.
Example Input/Output 2:
Input:
BOok
Look
Output: no
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        char b[]=sc.next().toCharArray();
        int c[]=new int[1000],d[]=new int[1000],k=0,l=0;
        if(a.length!=b.length){
            System.out.print("no");
            return;
        }else{
            for(int i=0;i<a.length;i++){
                int c1=0;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]) c1++;
                }
                c[k++]=c1;
                int c2=0;
                for(int j=i+1;j<b.length;j++){
                    if(b[i]==b[j]) c2++;
                }
                d[l++]=c2;
            }
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<k;j++){
                if(c[j-1]>c[j]){
                    int t=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t;
                }
            }
        }
        for(int i=0;i<l;i++){
            for(int j=1;j<l;j++){
                if(d[j-1]>d[j]){
                    int t=d[j-1];
                    d[j-1]=d[j];
                    d[j]=t;
                }
            }
        }
        int count=0;
        for(int i=0;i<k;i++){
            if(c[i]==d[i]) count++;
        }
        System.out.print((count==k)?"yes":"no");
	}
}
