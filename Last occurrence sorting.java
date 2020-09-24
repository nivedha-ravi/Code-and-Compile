/
Example Input/Output 1:
Input:
earthquakes
shake
Output:
hakes
Explanation:
Here S1 is earthquakes and S2 is shake.
The position of the last occurrence of s in earthquakes is 11.
The position of the last occurrence of h in earthquakes is 5.
The position of the last occurrence of a in earthquakes is 8.
The position of the last occurrence of k in earthquakes is 9.
The position of the last occurrence of e in earthquakes is 10.
So the characters in shake are printed in ascending order based on the positions of their last occurrence in S1.
Hence the output is hakes

Example Input/Output 2:
Input:
SoftwareHardwares
SHortS
Output:
SSotHr
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray(),b[]=sc.next().toCharArray();
        int c[]=new int[b.length],k=0;
        for(int i=0;i<b.length;i++){
            for(int j=a.length-1;j>=0;j--){
                if(b[i]==a[j]){
                    c[k++]=j;
                    break;
                }
            }
        }
        for(int i=0;i<k;i++){
            for(int j=1;j<k;j++){
                if(c[j-1]>c[j]){
                    int t=c[j-1];
                    c[j-1]=c[j];
                    c[j]=t;
                    char r=b[j-1];
                    b[j-1]=b[j];
                    b[j]=r;
                }
            }
        }
        System.out.print(b);
	 }
}
