
/*
Example Input/Output 1:
Input:
3 5 22
Output: YES
Explanation:
Here X = 3, Y = 5 and Z = 22.
The integer 22 is formed by the sum of 3, 3, 3, 3, 5 and 5.
So YES is printed as the output.
Example Input/Output 2:
Input:
11 7 23
Output: NO
Example Input/Output 3:
Input:
11 13 76
Output: YES
*/

import java.util.*;
public class Hello {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
      int z1=z,z2=z,f=0;
      while(z1>=0 && z2>=0)
      {
          if(z1%y ==0 || z2%x==0)
          {
              f=1;
              break;
          }
          z1 -= x;
          z2 -= y;
      }
  if(f==0)
      System.out.print("NO");
  else
      System.out.print("YES");
}
}

import java.util.*;
public class Hello {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
      while(z>=0){
          if(z%x==0){
              System.out.print("YES");
              return;
          }
          z-=y;
      }
      System.out.print("NO");
}
}


import java.util.*;
public class Hello {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  if (isTrue(sc.nextInt() , sc.nextInt() , sc.nextInt())){
      System.out.print("YES");
  }
  else
      System.out.print("NO");

}
static boolean isTrue(int a , int b, int c ){
    if (c<0)
        return false;
    if (c%a==0 || c%b==0){
        return true ;
    }
    if (isTrue(a,b,c-a) || isTrue(a,b,c-b)){
        return true;
    }
    return false;
}
}
