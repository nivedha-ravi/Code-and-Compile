/*
Example Input/Output 1:
Input: 5 4
12 100 67 89
61 88 59 79
86 35 46 65
37 30 25 36
32 25 13 32
Output: 3
Explanation:
In the given 5x4 matrix, the integers in the 2nd, 3rd and 4th columns are sorted in descending order.
So 3 is printed as the output.
Example Input/Output 2:
Input: 4 4
31 73 29 87
77 44 66 46
90 9 10 44
3 1 39 34
Output: 2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r=0;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n-1;j++){
                if(a[j][i]<a[j+1][i]){
                    c++;
                }
            }
            if(c==0) r++;
        }
        System.out.print(r);
	  }
}
