/*
Example Input/Output 1:
Input: 5
5 7
2 5
3 2
2 3
4 6
Output:
2 3 6
3 2 6
2 5 10
4 6 24
5 7 35
Explanation:
The area of the first rectangle is 35 (5*7).
The area of the second rectangle is 10 (2*5).
The area of the third rectangle is 6 (3*2).
The area of the fourth rectangle is 6 (2*3).
The area of the fifth rectangle is 24 (4*6).
After sorting the rectangles based on the given conditions, the rectangles become
2 3 6
3 2 6
2 5 10
4 6 24
5 7 35
Example Input/Output 2:
Input: 6
20 5
3 20
15 4
10 10
11 2
5 5
Output:
11 2 22
5 5 25
3 20 60
15 4 60
10 10 100
20 5 100
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=l[i]*b[i];
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(c[j-1]>c[j]){
                    int t=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t;
                    int t1=l[j-1];
                    l[j-1]=l[j];
                    l[j]=t1;
                    int t2=b[j-1];
                    b[j-1]=b[j];
                    b[j]=t2;
                }else if(c[j-1]==c[j]){
                    if(l[j-1]>l[j]){
                        int r=c[j-1];
                        c[j-1]=c[j];
                        c[j]=r;
                        int t2=l[j-1];
                        l[j-1]=l[j];
                        l[j]=t2;
                        int t1=b[j-1];
                        b[j-1]=b[j];
                        b[j]=t1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(l[i]+" "+b[i]+" "+c[i]);
        }
	}
}
