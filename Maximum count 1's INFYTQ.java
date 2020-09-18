
/*
An array of N elements is passed as input to the program.
The elements values are either 0 or 1.
Exactly one operation can be performed on any one of the subarray so as to invert all the bits (changing 0 to 1 and 1 to 0) in the selected subarray.
The minimum size of the subarray to be selected is 1 and the maximum size is N.
The program must print the maximum number of 1s that you can get by doing the operation described above.
Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains N. The second line contains N integers separated by a space..
Output Format:
The first line contains the maximum count of 1s.
Example Input/Output 1:
Input:
6
1 0 0 1 0 1
Output: 5
Explanation:
When we invert the sub-array from index 1 to 2 (that is second and third elements) we get 1 1 1 1 0 1.
Here we get the maximum count of 1s which is 5.
Example Input/Output 2:
Input:
9
1 0 0 1 0 0 1 1 1
Output: 8
*/

import java.util.*;
public class Hello {

  public static void main(String[] args) {
  //Your Code Here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      int ans=0;
      for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
              String d="";int max=0;
              for(int l=0;l<i;l++){
                  d+=a[l];
              }
              for(int k=i;k<=j;k++){
                  if(a[k]==1) d+=0;
                  else d+=1;
              }
              for(int h=j+1;h<n;h++){
                  d+=a[h];
              }
              for(int y=0;y<d.length();y++){
                  if(d.charAt(y)=='1') max++;
              }
              ans=Math.max(ans,max);
          }
      }
      System.out.print(ans);
  }
}
