/*
Example Input/Output 1:
Input: 3 3
53 66 72
59 10 79
73 35 25
Output:
74.67
72.67
Explanation:
The largest integer in the 1st row is 72.
The largest integer in the 2nd row is 79.
The largest integer in the 3rd row is 73.
So the average of 72, 79 and 73 is printed with the precision up to two decimal places (74.67).
The largest integer in the 1st column is 73.
The largest integer in the 2nd column is 66.
The largest integer in the 3rd column is 79.
So the average of 73, 66 and 79 is printed with the precision up to two decimal places (72.67).
Example Input/Output 2:
Input: 4 5
29 61 62 89 86
57 57 21 15 85
67 49 37 30 12
30 31 52 35 37
Output:
73.25
73.00
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        int sum=0;
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
            sum+=max;
        }
        float f=n;
        System.out.printf("%.2f",(float)(sum/f));
        sum=0;
        for(int i=0;i<m;i++){
            int max1=0;
            for(int j=0;j<n;j++){
                if(a[j][i]>max1){
                    max1=a[j][i];
                }
            }
            sum+=max1;
        }
        float g=m;
        System.out.printf("\n%.2f",(float)(sum/g));
	}
}
