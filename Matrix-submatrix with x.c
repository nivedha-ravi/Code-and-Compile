/*
print the largest submatrix with a corner element as x.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int r=sc.nextInt(),c=sc.nextInt();
       int mat[][]=new int[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++)
           mat[i][j]=sc.nextInt();
       }

       int x=sc.nextInt();

       int srow=0,scol=0,erow=0,ecol=0;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(mat[i][j] == x ){
                   if(i >= r/2  ) {
                       srow=0;
                       erow=i;
                       if(j >= c/2 ){
                           scol = 0;
                           ecol = j;
                       }
                       else{
                           scol=j;ecol=c-1;
                       }
                   }
                   else{
                       srow = i;
                       erow = r-1;
                       if( j>= c/2 ){
                           scol = 0;
                           ecol = j;
                       }
                       else{
                           scol=j;
                           ecol=c-1;
                       }

                   }
               }
           }
       }
       for(int i=srow;i<=erow;i++){
           for(int j=scol;j<=ecol;j++){
               System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
	}
}
