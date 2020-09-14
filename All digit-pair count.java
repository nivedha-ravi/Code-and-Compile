/*
Example Input/Output 1:
Input: 6
38479 74180 967132 1584604 726510 6512160
Output: 3
Explanation:
The 3 possible pairs are given below.
(38479, 726510) -> 38479726510
(38479, 6512160) -> 384796512160
(967132, 1584604) -> 9671321584604
The concatenation of the two integers in each pair contains all the digits from 0 to 9 at least once.
Example Input/Output 2:
Input: 4
2670589 243106 3145987 5789
Output: 4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        Set<Character> set=new TreeSet<Character>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i+1;j<n;j++){
                char[] s=(a[i]+a[j]).toCharArray();
                for(char h:s)
                    set.add(h);
                if(set.size()==10)
                    count++;
                set.clear();
            }
        }
        System.out.print(count);
	  }
}
