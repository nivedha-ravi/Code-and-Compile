
/*
Example Input/Output 1:
Input: sksrillsrsrsrsrsrskillrack
Output: 10
Explanation:
In the given string "sksrillsrsrsrsrsrskillrack" , the longest substring sr is srsrsrsrsr.
So the length of the longest substring is 10.
Hence the output is 10
Example Input/Output 2:
Input: SrsrsrAsrsrBsrcsrdsr
Output: 4
Example Input/Output 3:
Input: CLsrOUSAD
Output: 2
*/

import java.util.*;
public class Hello {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char s[]=sc.next().toCharArray();
      int l=s.length,c,max=0;
      for(int i=0;i<l-1;i++){
          c=0;
          if(s[i]=='s' && s[i+1]=='r'){
              c++;
              for(int j=i+2;j<l-1;j+=2){
                  if(s[j]=='s' && s[j+1]=='r'){
                      c++;
                  }else{
                      break;
                  }
              }
          }
          max=Math.max(max,c);
      }
      System.out.print(max*2);
  }
}
