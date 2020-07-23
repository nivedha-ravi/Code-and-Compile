/*
Example Input/Output 1:
Input: 4 5
0 0 0 0 0
1 0 0 1 0
0 0 0 1 1
0 1 0 0 0
Output: 3
Explanation:
x x x 0 0
1 y x 1 0
0 z x 1 1
0 1 x x x
The first way is xxxxxxxx.
The second way is xxyzxxxx.
The third way is xxyxxxxx.
Example Input/Output 2:
Input: 4 5
1 0 0 0 0
1 0 0 1 0
0 0 0 1 1
0 1 0 0 0
Output: 0
Example Input/Output 3:
Input: 4 5
0 0 0 0 0
1 0 0 1 0
0 0 0 1 1
0 1 0 0 1
Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		if(mat[0][0]==1){
		    System.out.print("0");
		    return;
		}
		int dp[][]=new int[r][c];
		dp[0][0]=1;
		for(int i=1;i<r;i++){
		    if(mat[i][0]==0){
		        dp[i][0]=1;
		    }else{
		        break;
		    }
		}
		for(int i=1;i<c;i++){
		    if(mat[0][i]==0){
		        dp[0][i]=1;
		    }else{
		        break;
		    }
		}
		for(int i=1;i<r;i++){
		    for(int j=1;j<c;j++){
		        if(mat[i][j]==0){
		        dp[i][j]=dp[i-1][j]+dp[i][j-1];
		        }
		    }
		}
		System.out.print(dp[r-1][c-1]);

	}
}
