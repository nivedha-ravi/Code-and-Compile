/*
Example Input/Output 1:
Input:
7
7 2 1 4 5 3 6
2
Output:
2 1
7 2
Explanation:
Here K = 2.
There is only one subarray having the minimum sum 3 is 2 and 1. So they are printed in the first line.
There are two subarrays having the same maximum sum 9, they are 7 2 and 3 6. So the integers in the first occurring subarray (7 2) are printed in the second line.
Example Input/Output 2:
Input:
6
25 16 14 78 19 12
4
Output:
14 78 19 12
25 16 14 78
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,i1=0,i2=0;
        for(int i=0;i<=n-k;i++){
            int sum=0,sum1=0;
            for(int j=i;j<i+k;j++){
                sum+=a[j];
                sum1+=a[j];
            }
            if(sum<min){
                i1=i;
            }
            else if(sum1>max){
                i2=i;
            }
        }
        for(int i=i1;i<i1+k;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=i2;i<i2+k;i++){
            System.out.print(a[i]+" ");
        }
	}
}
