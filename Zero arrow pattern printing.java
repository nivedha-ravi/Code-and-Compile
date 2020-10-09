/*
Example Input/Output 1:
Input: 3
Output:
* * 0
* 0 0
0 * 0
* 0 0
* * 0
Explanation:
Here N = 3, so the pattern contains 5 lines ((2*3)-1).
In the 1st row, the 3rd character is 0 and the remaining characters are asterisks.
* * 0
In the 2nd row, the 3rd, 2nd characters are 0 and the remaining character is an asterisk.
* 0 0
In the 3rd row, the 3rd, 1st characters are 0 and the remaining character is an asterisk.
0 * 0
In the 4th row, the 3rd, 2nd characters are 0 and the remaining character is an asterisk.
* 0 0
In the 5th row, the 3rd character is 0 and the remaining characters are asterisks. * * 0
Example Input/Output 2:
Input:
5
Output:
* * * * 0
* * * 0 0
* * 0 * 0
* 0 * * 0
0 * * * 0
* 0 * * 0
* * 0 * 0
* * * 0 0
* * * * 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=(n*2)-1,k=1;
        int a[][]=new int[r][n];
        for(int i=0;i<r;i++){
            for(int j=0;j<n;j++){
                if(j==n-1) a[i][j]=0;
                else if(i+j==n-1) a[i][j]=0;
                else a[i][j]=1;
            }
        }
        for(int i=n;i<r;i++){
            for(int j=0;j<n;j++){
                if(k==j) {
                    a[i][k]=0;
                    break;
                }
            }
            k++;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1)
                System.out.print("* ");
                else
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	}
}
