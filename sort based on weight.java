/*
Example Input/Output 1:
Input: 6
10 36 54 89 12 17
Output:
89 0
17 0
10 3
54 3
12 7
36 12
Explanation:
The weight of the integer 89 is 0 because it is not an even integer, not a perfect square and also not the multiple of 4 and not divisible by 6.
So 89 0 are printed.
The weight of the integer 17 is 0 because it is not an even integer, not a perfect square and also not the multiple of 4 and not divisible by 6.
So 17 0 are printed.
The weight of the integer 10 is 3 because it is an even integer.
So 10 3 are printed.
The weight of the integer 54 is 3 because it is an even integer.
So 54 3 are printed.
The weight of the integer 12 is 7 (3+4) because it is an even integer and also the multiple of 4 and divisible by 6.
So 12 7 are printed.
The weight of the integer 36 is 12 (3+5+4) because it is an even integer, perfect square and also the multiple of 4 and divisible by 6.
So 36 12 is printed.
Example Input/Output 2:
Input: 5
37 121 11 81 71
Output:
37 0
11 0
71 0
121 5
81 5
*/

import java.util.*;
public class Hello {
    public static boolean isPerfect(int n){
        for(int i=0;i<=n;i++){
            if(n==i*i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            a[i]=sc.nextInt();
            if(a[i]%4==0 && a[i]%6==0){
                sum+=4;
            }
            if(isPerfect(a[i])){
                sum+=5;
            }
            if(a[i]%2==0){
                sum+=3;
            }
            b[i]=sum;
        }
        int chance[]={12,9,8,7,5,4,3,0};
        for(int i=7;i>=0;i--){
            for(int j=0;j<n;j++){
                if(b[j]==chance[i]){
                    System.out.println(a[j]+" "+b[j]);
                }
            }
        }
	}
}
