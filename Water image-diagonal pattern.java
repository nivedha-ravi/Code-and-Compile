/*
Example Input/Output 1:
Input: 3
Output:
**1
*3 2
6 5 4
6 5 4
*3 2
**1
Explanation: Here N = 3, so the pattern contains 6 lines of output.
The first 3 lines are given below.
**1
*3 2
6 5 4
After printing the first 3 lines, the water image of the above 3 lines is printed.
Hence the output is
**1
*3 2
6 5 4
6 5 4
*3 2
**1
Example Input/Output 2:
Input: 4
Output:
***1
**3 2
*6 5 4
10 9 8 7
10 9 8 7
*6 5 4
**3 2
***1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int p=n-2,k1=0,k=1;
        for(int i=0;i<n;i++){
            int u=0;
            for(int j=0;j<=p;j++){
                System.out.print("*");
            }
            for(int j=p+1;j<n;j++){
                a[u++]=k++;
            }
            for(int j=u-1;j>=0;j--){
                System.out.print(a[j]+" ");
            }
            System.out.println();
            if(i==n-1){
                for(int j=u-1;j>=0;j--){
                    System.out.print(a[j]+" ");
                    k1=a[n-1];
                }
            }
            p--;
        }
        p=1;k=k1-n;
        for(int i=0;i<n;i++){
            if(i!=0){
                for(int j=0;j<p;j++){
                    System.out.print("*");
                }
                for(int j=p;j<n;j++){
                    System.out.print((k--)+" ");
                }
                p++;
            }
            System.out.println();
        }
	  }
}
