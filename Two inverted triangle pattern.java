
/*
Example Input/Output 1:
Input:
4
Output:
*********
0*00*00*0
00*0*0*00
000***000
0000*0000
Explanation:
Here N = 4.
R = N+1 = 4+1 = 5.
C = (N*2)+1 = (4*2)+1 = 9.
So a matrix of size 5x9 is generated with zeroes and it is given below.
000000000
000000000
000000000
000000000
000000000
After replacing the zeroes in the matrix based on the given conditions, the matrix becomes
*********
0*00*00*0
00*0*0*00
000***000
0000*0000
Example Input/Output 2:
Input:
5
Output:
***********
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000
00000*00000
*/

import java.util.*;
public class Hello {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=n+1,c=(n*2)+1;
      char a[][]=new char[r][c];
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              if(i==0 || j==c/2) a[i][j]='*';
              else a[i][j]='0';
          }
      }
      int v=c-1;
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              if(i==j) a[i][j]='*';
          }
          a[i][v--]='*';
      }
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              System.out.print(a[i][j]);
          }
          System.out.println();
      }
  }
}
