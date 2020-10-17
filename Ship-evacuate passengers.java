/*
Example Input/Output 1:
Input:
7
xyz men
ABCD children
Abc women
PQRS women
EFG children
Mno children
ijk men
4
Output:
3 1 0
Explanation:
There are 7 passengers in the ship and X = 4.
3 Children + 2 Women + 2 Men.
At t = 1, 1 child can be evacuated.
At t = 2, 1 child can be evacuated.
At t = 3, 1 child can be evacuated.
At t = 4, 1 woman can be evacuated.
Hence the output is 3 1 0
Example Input/Output 2:
Input:
5
PQR men
stu women
Xyz children
abc children
IJKL children
2
Output:
2 0 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,w=0,m=0;
        for(int i=0;i<n;i++){
            String b=sc.next();
            String a=sc.next();
            if(a.equals("children")) c++;
            else if(a.equals("women")) w++;
            else if(a.equals("men")) m++;
        }
        int k=sc.nextInt(),r=0,u=0,o=0;
        while(k>0){
            if(c>0) {
                r++;c--;
            }else if(w>0){
                u++;w--;
            }else if(m>0){
                o++;m--;
            }
            k--;
        }
        System.out.print(r+" "+u+" "+o);
	}
}
