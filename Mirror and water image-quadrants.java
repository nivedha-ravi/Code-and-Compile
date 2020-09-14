/*
Example Input/Output 1:
Input: 4 6
49 16 50 47 28 50
43 44 12 32 37 12
33 26 37 48 25 37
31 48 41 19 16 16
Output:
49 16 50 50 16 49
43 44 12 12 44 43
43 44 12 12 44 43
49 16 50 50 16 49
Explanation:
After replacing the top-right quadrant of the matrix with the mirror image of the top-left quadrant, the matrix becomes
49 16 50 50 16 49
43 44 12 12 44 43
33 26 37 48 25 37
31 48 41 19 16 16
After replacing the bottom-left quadrant of the matrix with the water image of the top-left quadrant, the matrix becomes
49 16 50 50 16 49
43 44 12 12 44 43
43 44 12 48 25 37
49 16 50 19 16 16
After replacing the bottom-right quadrant of the matrix with the mirror image of the bottom-left quadrant, the matrix becomes
49 16 50 50 16 49
43 44 12 12 44 43
43 44 12 12 44 43
49 16 50 50 16 49
Example Input/Output 2:
Input: 6 6
65 35 64 63 88 85
45 14 17 54 45 33
46 58 32 35 76 54
88 71 39 92 20 86
71 66 96 34 96 57
59 10 46 62 22 22
Output:
65 35 64 64 35 65
45 14 17 17 14 45
46 58 32 32 58 46
46 58 32 32 58 46
45 14 17 17 14 45
65 35 64 64 35 65
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        int a[][]=new int[100][100];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
                if(i<n/2 && j<m/2)
                a[i][j]=mat[i][j];
            }
        }
        int u=0,v;
        for(int i=0;i<n;i++){
            v=m/2;
            for(int j=m/2-1;j>=0;j--){
                a[u][v++]=a[i][j];
            }u++;
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=n/2-1;i>=0;i--){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	  }
}
