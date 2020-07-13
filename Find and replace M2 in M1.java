/*
input: 6
1 2 3 4 5 6
7 8 9 6 2 1
9 8 4 3 1 3
9 8 7 8 9 6
3 1 2 3 1 2
2 9 8 6 5 3
3
1 2 3
7 8 9
9 8 4
output:
* * * 4 5 6
* * * 6 2 1
* * * 3 1 1
9 8 7 8 9 6
3 1 2 3 1 2
2 9 8 6 5 3
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int mat[][]=new int[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		int n=sc.nextInt();
		int dup[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        dup[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<=N-n;i++){
		    for(int j=0;j<=N-n;j++){
		        int count=0;
		        for(int k=0;k<n;k++){
		            for(int l=0;l<n;l++){
		                if(mat[i+k][j+l]==dup[k][l]){
		                    count++;
		                }
		                else{
		                    break;
		                }
		            }
		        }
		        if(count==(n*n)){
		            for(int k=0;k<n;k++){
		                for(int l=0;l<n;l++){
		                    mat[i+k][l+j]=-1;
		                }
		            }
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(mat[i][j]==-1){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print(mat[i][j]+" ");
		        }
		    }
		    System.out.println();
		}

	}
  }
