/*
Example Input/Output 1:
Input: 3
7 8 9
6 3 4
1 5 7
rock
Output:
r 8 r
6 o 4
o c k
Explanation:
In the given 3x3 matrix, the odd integers are highlighted below.
7 8 9
6 3 4
1 5 7
The number odd integers in the matrix is 6 which is greater than the length of the string rock.
Therefore, when traversing the matrix spirally in the anti-clockwise direction, the odd integers and their replacement characters are given below.
7 -> r
1 -> o
5 -> c
7 -> k
9 -> r (after the last character, start replacing from the first character in S)
3 -> o
So the matrix becomes
r 8 r
6 o 4
o c k
Example Input/Output 2:
Input: 6
12 23 34 4 6 89
31 55 45 15 87 91
63 74 32 44 98 86
23 43 56 87 99 54
11 34 56 88 98 45
34 44 46 88 67 54
ENVIRONMENT
Output:
12 E 34 4 6 M
E N I V N N
N 74 32 44 98 86
V T 56 R E 54
I 34 56 88 98 O
34 44 46 88 R 54
Example Input/Output 3:
Input: 2
65 71
23 16
Apple
Output:
A p
p 16
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String mat[][]=new String[n][n];
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		mat[i][j]=sc.next();
		String s=sc.next();
		int ind=0,len=s.length(),sr=0,se=n-1;
		for(int i=0;i<n/2+n%2;i++){
		    for(int j=sr;j<=se;j++){
		    if(Integer.parseInt(mat[j][i])%2==1)
		    mat[j][i]=(s.charAt(ind++)+"");
		    if(ind>=len) ind=0;}
		    for(int j=sr+1;j<=se;j++){
		        if(Integer.parseInt(mat[se][j])%2==1)
		        mat[se][j]=(s.charAt(ind++)+"");
		        if(ind>=len) ind=0;
		    }
		    for(int j=se-1;j>=i;j--){
		        if(Integer.parseInt(mat[j][se])%2==1)
		        mat[j][se]=(s.charAt(ind++)+"");
		        if(ind>=len) ind=0;
		    }
		    for(int j=se-1;j>i;j--){
		        if(Integer.parseInt(mat[i][j])%2==1)
		        mat[i][j]=(s.charAt(ind++)+"");
		        if(ind>=len) ind=0;
		    }
		    if(ind>=len) ind=0;
		    se--;sr++;
		}
		for(int i=0;i<n;i++,System.out.println())
		for(int j=0;j<n;j++)
		System.out.print(mat[i][j]+" ");

	}
}
