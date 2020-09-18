/*
The program must accept an integer N as the input.
The program must print the desired pattern as shown in the Example Input/Output section.
Boundary Condition(s):
3 <= N <= 50
Input Format:
The first line contains N.
Output Format:
The lines containing the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input: 5
Output:
*****
-***-
--*--
-***-
*****
Example Input/Output 2:
Input: 8
Output:
********
-******-
--****--
---**---
---**---
--****--
-******-
********
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0,r=0,l=n-1;
        String a[]=new String[n];
        for(int i=0;i<=n/2;i++){
            String d="";
            for(int y=0;y<k;y++){
                System.out.print("-"); d+='-';
            }
            for(int y=k;y<=l;y++){
                System.out.print("*"); d+='*';
            }
            for(int y=l+1;y<n;y++){
                System.out.print("-"); d+='-';
            }
            a[r++]=d;
            k++;l--;
            System.out.println();
            if(i==(n/2)-1 && n%2==0) break;
        }
        for(int i=r-1;i>=0;i--){
            if(n%2!=0 && i==r-1) continue;
            else System.out.println(a[i]);
        }
	  }
}
