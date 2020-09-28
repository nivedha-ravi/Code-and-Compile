/*
Example Input/Output 1:
Input:
4 4
u m o a
i n a q
y e r w
i n o e
Output: 6
Explanation:
The diagonals that are parallel to the top-left to bottom-right diagonal and having only vowels are highlighted below.
u m o a
i n a q
y e r w
i n o e
The diagonals that are parallel to the top-right to bottom-left diagonal and having only vowels are highlighted below.
u m o a
i n a q
y e r w
i n o e
The total number of diagonals with only vowels is 6.
So 6 is printed as the output.
Example Input/Output 2:
Input:
5 4
Y o V A
k L v d
H q L h
j A v u
e O a R
Output: 3
*/


import java.util.*;
public class Hello {
    static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        return true;
        else
            return false;
    }
    static boolean helper(char[][] m,int i,int j,int r,int c,int f){
        while(i>=0 && j<c && f==1){
            if(isVowel(m[i][j])==false)return false;
            i--;j++;
        }
        while(i>=0 && j>=0 && f==0){
            if(isVowel(m[i][j])==false)return false;;
            i--;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] m = new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++)m[i][j] = sc.next().charAt(0);
		}
		int ans = 0;
		for(int i=0;i<r;i++){
		    if(helper(m,i,0,r,c,1)==true)ans++;
		}
		for(int i=1;i<c;i++){
		    if(helper(m,r-1,i,r,c,1)==true)ans++;
		}
		for(int i=0;i<r;i++){
		    if(helper(m,i,c-1,r,c,0)==true)ans++;
		}
		for(int i=c-2;i>=0;i--){
		    if(helper(m,r-1,i,r,c,0)==true)ans++;
		}
        System.out.print(ans);
	}
}


import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
        int r=0,l=0,c=0,r1=0,e=0;
        while(r<n){
            int t=0,count=0;
            for(int i=r,j=0;i>=0 && j<m;i--,j++){
                t++;
                if(isVow(a[i][j])){
                    count++;
                }
            }
            if(t==count) r1+=count;
            r++;l++;
        }
        r=n-1;c=1;
        while(l<(n+m)-1){
            int t=0,count=0;
            for(int i=r,j=c;i>=0 && j<m;i--,j++){
                t++;
                if(isVow(a[i][j])) {
                    count++;
                }
            }
            if(t==count) r1+=count;
            l++;c++;
        }
        r=n-1;l=0;
        while(r>=0){
            int t=0,count=0;
            for(int i=r,j=0;i<n && j<m;i++,j++){
                t++;
                if(isVow(a[i][j])) count++;
            }
            if(t==count) e++;
            r--;l++;
        }
        c=1;
        while(l<(n+m)-1){
            int t=0,count=0;
            for(int i=0,j=c;i<n && j<m;i++,j++){
                t++;
                if(isVow(a[i][j])) count++;
            }
            if(t==count) e++;
            c++;l++;
        }
	    System.out.print(Math.max(r1,e));
    }
    public static boolean isVow(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            return true;
        }
        return false;
    }
}
