
/*
Example Input/Output 1:
Input: 3
Output:
0
1
0 0
0 1
1 0
1 1
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
Explanation: Here N = 3.
All possible binary representations using 1 bit are 0 and 1.
All possible binary representations using 2 bits are 00, 01, 10 and 11.
All possible binary representations using 3 bits are 000, 001, 010, 011, 100, 101, 110 and 111.
Example Input/Output 2:
Input: 2
Output:
0
1
0 0
0 1
1 0
1 1
*/

import java.util.*;
public class Hello {
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt(),i,j,k;
  String a="",b="";
  for(i=1;i<=n;i++){
      for(j=0;j<(int)(Math.pow(2,i));j++){
          a=Integer.toBinaryString(j);
          if(a.length()==i){
              for(k=0;k<a.length();k++){
                  System.out.print(a.charAt(k)+" ");
              }
          }
          else{
              for(k=0;k<i-a.length();k++){
                  System.out.print("0 ");
              }
              for(k=0;k<a.length();k++){
                  System.out.print(a.charAt(k)+" ");
              }
          }
         System.out.println();
      }
    }
 }
}


import java.util.*;
public class Hello {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<String > arr= new ArrayList<>();
      arr.add("0 ");
      arr.add("1 ");
      int n= sc.nextInt();
      for(int i = 0 ; i < n ; i++){
          List<String> temp = new ArrayList<>();
          for(String str : arr){
              temp.add(str+"0 ");
              temp.add(str+"1 ");
              System.out.println(str);
          }
          arr = temp;
      }
  }
}
