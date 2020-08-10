/*
Example Input/Output 1:
Input: 4 5
3 9 8 4 3
2 1 3 2 1
7 4 8 2 1
4 3 8 3 6
Output:
4 3 3 8 9
2 1 2 3 1
2 1 7 8 4
3 6 4 8 3
Explanation:
The largest integer in the 1st column of the matrix is 7.
The largest integer in the 2nd column of the matrix is 9.
The largest integer in the 3rd column of the matrix is 8.
The largest integer in the 4th column of the matrix is 4.
The largest integer in the 5th column of the matrix is 6.
After sorting all the columns of the matrix in ascending order based on the largest integer, the matrix becomes
4 3 3 8 9
2 1 2 3 1
2 1 7 8 4
3 6 4 8 3
Example Input/Output 2:
Input: 3 7
6 7 11 20 12 13 17
1 10 5 4 10 16 17
16 18 15 8 12 3 17
Output:
12 11 6 13 17 7 20
10 5 1 16 17 10 4
12 15 16 3 17 18 8
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int mat[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[j][i]=a[i][j];
            }
        }
        int b[]=new int[m];
        int k=0;
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(mat[i][j],max);
            }
            b[k++]=max;
        }
        int c[]=new int[m];
        for(int i=0;i<m;i++){
            c[i]=i;
        }
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(b[i]==b[j]){
                    continue;
                }
                else if(b[i]>b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    int t1=c[i];
                    c[i]=c[j];
                    c[j]=t1;
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            list.add(c[i]);
        }
        int u,v=0;
        int h[][]=new int[n][m];
        for(int i:list){
            u=0;
            for(int j=0;j<n;j++){
                h[u++][v]=a[j][i];
            }
            v++;
        }
        for(int i=0;i<u;i++){
            for(int j=0;j<v;j++){
                System.out.print(h[i][j]+" ");
            }
            System.out.println();
        }
	}
}
