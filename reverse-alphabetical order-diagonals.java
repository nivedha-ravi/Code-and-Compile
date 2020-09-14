/*
Example Input/Output 1:
Input: 6 6
m f x k b o
f y l d r p
z m f t p h
n h u p d l
j u p h m w
v p j m v u
Output: NO
Explanation:
There are 2 top-right to bottom-left diagonals where the alphabets are not arranged in reverse alphabetical order.
m f x k b o
f y l d r p
z m f t p h
n h u p d l
j u p h m w
v p j m v u
So NO is printed as the output.
Example Input/Output 2:
Input: 3 4
a s p u
t q v b
z x b i
Output: YES
*/

import java.util.*;
public class Hello {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.next().charAt(0);
        int r=0,l=0,ref=0,c=0;
        while(r<n){
            ref++;
            String d="";
            for(int i=r,j=0;i>=0&&j<m;i--,j++){
                d+=a[i][j];
            }
            meow(d);
            r++;l++;
        }
        r=n-1;c=1;
        while(l<(n+m)-1){
            ref++;
            String s="";
            for(int i=r,j=c;i>=0&&j<m;i--,j++){
                s+=a[i][j];
            }
            meow(s);
            l++;c++;
        }
        System.out.print((ref==count)?"YES":"NO");
	}
	public static int meow(String s){
	    StringBuffer sb=new StringBuffer(s);
	    String b=sb.reverse().toString();
	    char d[]=s.toCharArray();
	    Arrays.sort(d);
	    String dup=new String(d);
	    if(b.equals(dup)){
	        count++;
	    }
	    return count;
	}
}
