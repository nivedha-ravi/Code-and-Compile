/*
Example Input/Output 1:
Input:
13
Output:
13 40 20 10 5 16 8 4 2 1
Explanation:
Here N = 13, so the first term of the sequence is 13.
The next term of 13 is 40 ((13*3)+1, as 13 is odd).
The next term of 40 is 20 (40/2, as 40 is even).
The next term of 20 is 10 (20/2, as 20 is even).
The next term of 10 is 5 (10/2, as 10 is even).
The next term of 5 is 16 ((5*3)+1, as 5 is odd).
The next term of 16 is 8 (16/2, as 16 is even).
The next term of 8 is 4 (8/2, as 8 is even).
The next term of 4 is 2 (4/2, as 4 is even).
The next term of 2 is 1 (2/2, as 2 is even).
Hence the output is 13 40 20 10 5 16 8 4 2 1
Example Input/Output 2:
Input:
10
Output:
10 5 16 8 4 2 1
Example Input/Output 3:
Input:
17
Output:
17 52 26 13 40 20 10 5 16 8 4 2 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.print(n+" ");
        while(true){
            if(n==1) break;
            if(n%2==0){
                System.out.print(n/2+" ");
                n/=2;
            }else{
                System.out.print((n*3)+1+" ");
                n=(n*3)+1;
            }
        }
	}
}
