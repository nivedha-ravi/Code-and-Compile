/*
Example Input/Output 1:
Input:
verified correct
Output:
vt ee rr ie fe ie ee dc
Explanation:
Here S1 = verified and S2 = correct.
The nearest alphabet of v is t.
The nearest alphabet of e is e.
The nearest alphabet of r is r.
The nearest alphabet of i is e.
The nearest alphabet of f is e.
The nearest alphabet of i is e.
The nearest alphabet of e is e.
There are two nearest alphabets (c and e) for d.
So the smallest alphabet c is considered.
Hence the output is vt ee rr ie fe ie ee dc
Example Input/Output 2:
Input:
MONOPOLY INDIA
Output:
MN ON NN ON PN ON LN YN
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char s1[]=sc.next().toCharArray();
        char s2[]=sc.next().toCharArray();
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            int max=Integer.MAX_VALUE;
            String dup="";
            for(int j=0;j<s2.length;j++){
                int d=Math.abs((int)s1[i]-(int)s2[j]);
                if(d<max) {
                    max=d;
                    dup=s2[j]+"";
                }
            }
            System.out.print((s1[i]+dup)+" ");
        }
	}
}
