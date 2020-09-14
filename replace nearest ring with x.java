/*
Example Input/Output 1:
Input: 5 6
0 1 1 1 0 1
1 1 0 1 1 0
0 1 1 X 0 1
0 0 1 0 0 1
0 0 0 1 1 0
Output:
0 1 1 1 0 1
1 1 1 1 1 0
0 1 1 X 1 1
0 0 1 1 1 1
0 0 0 1 1 0
Explanation:
The full ring near to X with at least one 0 is highlighted below.
0 1 1 1 0 1
1 1 0 1 1 0
0 1 1 X 0 1
0 0 1 0 0 1
0 0 0 1 1 0
After replacing 0s in the full ring with 1s, the matrix becomes
0 1 1 1 0 1
1 1 1 1 1 0
0 1 1 X 1 1
0 0 1 1 1 1
0 0 0 1 1 0
Example Input/Output 2:
Input: 8 7
1 0 0 1 0 0 0
0 1 1 0 1 1 0
1 1 1 1 1 1 1
1 1 X 1 0 1 0
1 1 1 1 1 1 0
0 1 1 0 1 0 1
0 0 1 0 0 0 1
0 1 1 1 1 1 0
Output:
1 0 0 1 0 0 0
1 1 1 1 1 1 0
1 1 1 1 1 1 1
1 1 X 1 1 1 0
1 1 1 1 1 1 0
1 1 1 1 1 0 1
0 0 1 0 0 0 1
0 1 1 1 1 1 0
Example Input/Output 3:
Input: 3 4
1 0 1 0
X 0 1 0
0 0 0 0
Output:
1 0 1 0
X 0 1 0
0 0 0 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        char a[][]=new char[n][m];
        int minR=0,minC=0,maxR=0,maxC=0,p=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.next().charAt(0);
                if(a[i][j]=='X'){
                    minR=i;maxR=i;minC=j;maxC=j;
                }
            }
        }
        while(minR>0 && minC>0 && maxR<n-1 && maxC<m-1){
            minC--;minR--;maxC++;maxR++;
            for(int i=minR;i<=maxR;i++){
                for(int j=minC;j<=maxC;j++){
                    if(a[i][j]=='0'){
                        a[i][j]='1';p=1;
                    }
                }
            }
            if(p==1) break;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
	}
}
