
/*
Example Input/Output 1:
Input: 3 2 2 2 4
Output: 21
Explanation:
The given integers are 3 2 2 2 4.
Here the integer 2 is repeated continuously.
The first occurring 2 never changes.
The second occurring 2 is replaced with 4 (2 * 2).
The third occurring 2 is replaced with 8 (4 * 2).
The sum of integers in the modified list is 21 (3 + 2 + 4 + 8 + 4).
So 21 is printed as the output.
Example Input/Output 2:
Input: 3 3 3 2 4 4 9
Output: 44
Example Input/Output 3:
Input: 10 5 10 1 2 5 1
Output: 34
*/

import java.util.*;
public class Hello {

  public static void main(String[] args) {
  //Your Code Here
      Scanner sc=new Scanner(System.in);
      String s[]=sc.nextLine().split(" ");
      long a[]=new long[s.length];
      for(int i=0;i<s.length;i++){
          a[i]=Long.parseLong(s[i]);
      }
      long sum=a[0];
      for(int i=1;i<s.length;i++){
          if(s[i].equals(s[i-1])){
            a[i]=a[i-1]*2;
          }
          sum+=a[i];
      }
      System.out.println(sum);
}
}
