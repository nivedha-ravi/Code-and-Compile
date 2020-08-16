/*
Example Input/Output 1:
Input: 5 5
0 0 0 1 0
0 0 0 1 1
0 0 0 0 0
0 0 0 1 0
0 1 1 1 1
Output: 5
Explanation:
The largest battalion in the war field is highlighted below.
0 0 0 1 0
0 0 0 1 1
0 0 0 0 0
0 0 0 1 0
0 1 1 1 1
Here the number of soldiers in the largest battalion is 5, so 5 is printed as the output.
Example Input/Output 2:
Input: 6 4
0 0 0 1
0 0 0 0
0 0 1 1
0 1 1 0
0 0 0 1
0 0 1 1
Output: 4
*/

import java.util.*;
public class Hello {

    public static List<Integer> tra(List<Integer> al,int[][] mat,int i,int j,int r,int c){
        if(i>0&&i<=r&&j>0&&j<=c){
            if(mat[i][j]!=1)
            return al;
            al.add(1);
            mat[i][j]=2;
            tra(al,mat,i-1,j,r,c);
            tra(al,mat,i+1,j,r,c);
            tra(al,mat,i,j-1,r,c);
            tra(al,mat,i,j+1,r,c);
        }
        return al;
    }
    public static void main(String[] args) {
	 Scanner sc=new Scanner( System.in);
	 int r=sc.nextInt();
	 int c=sc.nextInt();
	 int[][] mat=new int[r+1][c+1];
	 for(int i=1;i<=r;i++){
	     for(int j=1;j<=c;j++)
	     mat[i][j]=sc.nextInt();
	 }
	 int max=1;
	 for(int i=1;i<=r;i++){
	     for(int j=1;j<=c;j++){
	         if(mat[i][j]==1){
	             List<Integer> al=new ArrayList<>();
	             List<Integer> li=tra(al,mat,i,j,r,c);
	             if(li.size()>max)
	             max=li.size();
	         }
	     }
	 }
	 System.out.println(max);

	}
}
