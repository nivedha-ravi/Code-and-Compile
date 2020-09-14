/*
Input: 5 5
33 18 38 14 47
30 28 17 50 30
47 50 28 26 44
48 18 15 40 5
48 38 30 19 16
Output:
48 18 15 40 5
48 38 30 19 16
30 28 17 50 30
47 50 28 26 44
33 18 38 14 47
Explanation:
In the given 5x5 matrix, the last integer in each row is highlighted below.
33 18 38 14 47
30 28 17 50 30
47 50 28 26 44
48 18 15 40 5
48 38 30 19 16
After sorting the rows of the matrix based on the last integer, the matrix becomes
48 18 15 40 5
48 38 30 19 16
30 28 17 50 30
47 50 28 26 44
33 18 38 14 47
Example Input/Output 2:
Input: 3 4
4 9 8 2
5 6 7 1
2 6 3 2
Output:
5 6 7 1
4 9 8 2
2 6 3 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
            c[i]=i;
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i][m-1];
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(b[j-1]>b[j]){
                    int t=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t;
                    int y=c[j-1];
                    c[j-1]=c[j];
                    c[j]=y;
                }
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            int h=i;
            i=c[k++];
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            i=h;
            System.out.println();
        }
	  }
}
