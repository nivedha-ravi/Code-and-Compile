/*
Boundary Condition(s):
3 <= N <= 50 4 <= Length of each string <= 50
Input Format:
The first line contains N. The next N lines, each contains a string.
Output Format:
The first R lines, each contains C characters representing the modified matrix.
Example Input/Output 1:
Input:
4
word
neck
mass
give
Output:
word**
*n****
*emass
*c*g**
*k*i**
***v**
***e**
Explanation:
Here N = 4 and L = 4.
The value of N is even, so R = 4 + 4 - 1 = 7 and C = 7 - 1 = 6.
A matrix of size 7x6 is generated with asterisks.
******
******
******
******
******
******
******
After replacing the asterisks with the 4 string values based on the given conditions, the matrix becomes
word**
*n****
*emass
*c*g**
*k*i**
***v**
***e**
Example Input/Output 2:
Input:
5
Heaven
PeoplE
Family
Nature
officE
Output:
Heaven****
*P********
*eFamily**
*o*N******
*p*aofficE
*l*t******
*E*u******
***r******
***e******
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] s=new String[n];
		for(int i=0;i<n;i++){
		    s[i]=sc.nextLine();
		}
		int r=-1,c=-1;
        if(n%2==0){
            r=(n+(s[0].length()))-1;
            c=r-1;
        }else{
            r=(n+(s[0].length()))-2;
            c=r+1;
        }
        char[][] mat=new char[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(mat[i],'*');
        }
        int t=0,pos=1,a=0;
        for(int i=0;i<n;i++){
            int m=0;
            if(pos%2!=0){
                    for(int j=t;j<c;j++){
                        mat[t][j]=s[a].charAt(m++);
                        if(m==s[0].length()){
                            break;
                        }
                    }
            }else{
                for(int i=t;i<r;i++){
                    mat[i][t]=s[a].charAt(m++);
                    if(m==s[0].length()){
                        break;
                    }
                }
            }
            pos++;t++;a++;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
	}
}
