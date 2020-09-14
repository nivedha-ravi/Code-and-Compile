/*
Example Input/Output 1:
Input: 4
1234 967 20043 100
Output: 4254
Explanation:
The first integer 1234 is an even integer. After sorting the digits in 1234 except the unit digit in descending order, the integer becomes 3214.
The second integer 967 is an odd integer. After sorting the digits in 967 except the unit digit in ascending order, the integer becomes 697.
The third integer 20043 is an odd integer. After sorting the digits in 20043 except the unit digit in ascending order, the integer becomes 243.
The fourth integer 100 is an even integer. After sorting the digits in 100 except the unit digit in descending order, the integer becomes 100.
The sum of the integers 3214, 697, 243 and 100 is 4254.
So 4254 is printed as the output.
Example Input/Output 2:
Input: 7
321 84 55 67 901 826 230
Output: 1674
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            char s[]=a[i].substring(0,a[i].length()-1).toCharArray();
            Arrays.sort(s);
            if(Integer.parseInt(a[i])%2==0){
                String dup="";
                for(int j=s.length-1;j>=0;j--){
                    dup+=s[j];
                }
                String fin=dup+a[i].charAt(a[i].length()-1);
                sum+=Integer.parseInt(fin);
            }else{
                String h=new String(s);
                String dup=h+a[i].charAt(a[i].length()-1);
                sum+=Integer.parseInt(dup);
            }
        }
        System.out.print(sum);
	  }
}
