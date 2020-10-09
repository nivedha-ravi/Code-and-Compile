/*
Example Input/Output 1:
Input: 147
Output:
147 417 471 741
Explanation: Here N = 147.
The integers formed using all the digits of 147 are 147, 174, 417, 471, 714 and 741.
The odd integers are 147, 417, 471 and 741.
Hence the output is 147 417 471 741
Example Input/Output 2:
Input: 1035
Output:
135 153 315 351 513 531 1035 1053 1305 1503 3015 3051 3105 3501 5013 5031 5103 5301
Example Input/Output 3:
Input: 6772
Output:
2677 2767 6277 6727 7267 7627
*/

import java.util.*;
public class Hello {
public static Set<Integer>list=new TreeSet<>();
  public static void permutation(String str,String res){
      int n=str.length();
      if(str.length()==0){
          list.add(Integer.parseInt(res));
      }
      for(int i=0;i<n;i++){
          char ch=str.charAt(i);
          String s=str.substring(0,i)+str.substring(i+1);
          permutation(s,res+ch);
      }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String s1=N+"";
    String s2="";
    permutation(s1,s2);
    for(int p:list){
        if(p%2!=0){
            System.out.print(p+" ");
        }
     }
	}
}
