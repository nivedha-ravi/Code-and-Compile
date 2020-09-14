/*
Example Input/Output 1:
Input:
5 5
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
1 2
>>>v
Output:
2 3 4 5 0
Explanation:
The starting position of the path is (1, 2).
The path P is >>>v.
The integers present in the given path P are highlighted below.
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
6 7 8 9 0
1 2 3 4 5
Hence the output is 2 3 4 5 0
Example Input/Output 2:
Input: 3 4
1 2 3 4
5 6 7 8
1 2 3 0
1 1
>>vv<v>
Output:
Invalid Path
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	 Scanner sc=new Scanner( System.in);
	 int r=sc.nextInt();
	 int c=sc.nextInt();
	 int[][] m=new int[r+1][c+1];
	 for(int i=1;i<=r;i++){
	     for(int j=1;j<=c;j++)
	     m[i][j]=sc.nextInt();
	 }
	 int srow=sc.nextInt();
	 int scol=sc.nextInt();
	 String s=sc.next();
	 int l=s.length();
	 List<Integer> al=new ArrayList<>();
	 al.add(m[srow][scol]);
	 for(int i=0;i<l;i++){
	     char t=s.charAt(i);
	     if(t=='>')
	     scol++;
	     else if(t=='v')
	     srow++;
	     else if(t=='<')
	     scol--;
	     else if(t=='^')
	     srow--;
	     if(srow<=0||scol<=0||srow>r||scol>c){
	         System.out.println("Invalid Path");
	         return;
	     }
	     al.add(m[srow][scol]);
	 }
	 for(int i:al)
	 System.out.print(i+" ");

	}
}
