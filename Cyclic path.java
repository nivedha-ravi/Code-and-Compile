/*
Example Input/Output 1:
Input:
4
2 3
5 1
3 5
1 2
Output: YES
Explanation:
The cyclic path formed using the 4 paths is given below.
2 -> 3 -> 5 -> 1 -> 2
So YES is printed as the output.
Example Input/Output 2:
Input:
4
-2 -4
-3 -1
-4 -3
-1 2
Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int p=b[0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j]==p && a[j]!=101){
                    p=b[j];
                    a[j]=101;b[j]=101;
                    break;
                }
            }
        }
        Set<Integer> l=new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            l.add(a[i]);
        }
        if(l.size()==1)
        System.out.print("YES");
        else
        System.out.print("NO");
	}
}
