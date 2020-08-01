/*
input 1:
7 7
3 3
6 0
output: 11
explanation:
the bishop movable squares are -
- * * * * * -
* - * * * - *
* * - * - * *
* * * B * * *
* * - * - * *
* - * * * - *
P * * * * * -
count is 11.
input 2:
5 6
1 1
3 1
output: 6
explanation:
- * - * * *
* B * * * *
- * - * * *
* P * - * *
* * * * - *
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==a && j==b){
                    mat[i][j]=11;
                }else{
                    mat[i][j]=1;
                }
            }
        }
        int row=x-1,col=y-1,count=0;
        while(row>=0 && col>=0 )
        {
            if(mat[row][col]==11)
                break;
            else
                count++;
                row--;
                col--;
        }
        row=x-1;col=y+1;
        while(row>=0 && col<m)
        {
            if(mat[row][col]==11)
                break;
            else
                count++;
                row--;
                col++;
        }
        row=x+1;col=y+1;
        while(row<n && col<m)
        {
            if(mat[row][col]==11)
                break;
            else
                count++;
                row++;
                col++;
        }
        row=x+1;col=y-1;
        while(row<n && col>=0)
        {
            if(mat[row][col]==11)
                break;
            else
                count++;
                row++;
                col--;
        }
        System.out.print(count);
    }
}
