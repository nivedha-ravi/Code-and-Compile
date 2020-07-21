/*Example Input/Output 1:
Input:
abcdefghijklmnopqrstuvwxyz
dab
Output: 7
Explanation: The order of 26 rooms is abcdefghijklmnopqrstuvwxyz.
The rooms that have ordered breakfast are d, a and b.
The first room to serve breakfast is room d.
For the server, it will take 3mins to travel from the room a to the room d (abcdefghijklmnopqrstuvwxyz).
The second room to serve breakfast is room a.
For the server, it will take 3mins to travel from the room d to the room a (abcdefghijklmnopqrstuvwxyz).
The third room to serve breakfast is room b.
For the server, it will take 1min to travel from the room a to the room b (abcdefghijklmnopqrstuvwxyz).
So the total time taken to serve breakfast to all the rooms is 7 (3+3+1).
Hence the output is 7
Example Input/Output 2:
Input:
MNBVCXZASDFGHJKLPOIUYTREWQ
ALPA
Output: 25
Example Input/Output 3:
Input:
aAbBcCdDeEfFgGhHiIjJkKlLmM
efgEFG
Output: 19
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char b[]=s1.toCharArray();
        int h=0,sum=0;
        for(int i=0;i<b.length;i++){
            char r=b[i];
            int m=s.indexOf(r);
            sum+=Math.abs(h-m);
            h=m;
            m=0;
        }
        System.out.print(sum);
	}
}
