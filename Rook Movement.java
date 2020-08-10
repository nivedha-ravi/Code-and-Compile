/*
Example Input/Output 1:
Input:
8 8
4 6
5 6
Output: 11
Explanation:
The rook movable squares are highlighted below.
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * R *
* * * * * * P *
* * * * * * * *
* * * * * * * *
The asterisks represent the empty squares.
R represents the rook.
P represents the pawn.
The number of squares that rook can move is 11.
So it is printed as the output.
Example Input/Output 2:
Input:
5 6
2 4
1 2
Output: 9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int m=sc.nextInt();
        int x=sc.nextInt();  int y=sc.nextInt();
        int a=sc.nextInt();  int b=sc.nextInt();
        char mat[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]='*';
            }
        }
        int s=x,s1=x,t=y,u=a,v=b,c=0;
        mat[x][y]='R';
        mat[a][b]='P';
        while(x>=0){
            if(mat[x][t]=='P')
            break;
            c++;x--;
        }
        while(y>=0){
            if(mat[s][y]=='P')
            break;
            c++;y--;
        }
        while(s<n){
            if(mat[s][t]=='P')
            break;
            c++;s++;
        }
        while(t<m){
            if(mat[s1][t]=='P')
            break;
            c++;t++;
        }
        System.out.print(c-4);
	}
}
