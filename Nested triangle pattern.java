/*
Example Input/Output 1:
Input:
5
Output:
####H
###HOH
##HOHOH
#HOOOOOH
HHHHHHHHH
Explanation: Here N = 5, so the triangle contains 3 layers ((5+1)/2).
The outer layer contains the character H.
The middle layer contains the character O.
The inner layer contains the character H.
Hash symbols (#) are printed in front of the first 4 rows of the triangle.
####H
###HOH
##HOHOH
#HOOOOOH
HHHHHHHHH
Example Input/Output 2:
Input:
6
Output:
#####H
####HOH
###HOHOH
##HOHHHOH
#HOOOOOOOH
HHHHHHHHHHH
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n-2;
        char c[][]=new char[n][10000];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<=p) c[i][j]='#';
                else c[i][j]='H';
            }
            p--;
        }
        for(int k=1;k<(n+1)/2;k+=2){
            for(int i=0;i<n;i++){
                for(int j=0;j<n+i;j++){
                    if(j==n+i-k-1 && i>=k && i<n-k)
                    c[i][j]='O';
                    else if(j==n-i+k-1 && i>=k && i<n-k)
                    c[i][j]='O';
                    else if(j>=n-i+k-1 && j<n+i-k && i==n-k-1)
                    c[i][j]='O';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
	}
}
