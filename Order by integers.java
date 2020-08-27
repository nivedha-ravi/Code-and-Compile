/*
Example Input/Output 1:
Input: 9 3
10 7 1 4 5 4 7 5 4
7 4 5
Output:
7 7 4 4 4 5 5 1 10
Explanation: Here M = 9, N = 3.
The integers in the first list are 10 7 1 4 5 4 7 5 4.
The integers in the second list are 7 4 5.
The first integer in the second list is 7, which is present twice in the first list.
The second integer in the second list is 4, which is present thrice in the first list.
The third integer in the second list is 5, which is present twice in the first list.
So the integers 7 7 4 4 4 5 5 are printed first.
The remaining integers in the first list are 10 and 1.
So they are sorted in ascending order and printed last.
Hence the output is 7 7 4 4 4 5 5 1 10
Example Input/Output 2:
Input: 7 2
2 1 3 2 0 2 4
0 1
Output:
0 1 2 2 2 3 4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int d[]=new int[n];
        int u=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(b[i]==a[j])
                    System.out.print(a[j]+" ");
                    a[j]=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=-1)
            d[u++]=a[i];
        }
        for(int i=0;i<u;i++){
            for(int j=i+1;j<u;j++){
                if(d[i]>d[j]){
                    int t=d[i];
                    d[i]=d[j];
                    d[j]=t;
                }
            }
        }
        for(int i=0;i<u;i++)
        System.out.print(d[i]+" ");
	  }
}
