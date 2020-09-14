/*
Example Input/Output 1:
Input: 5 4
14 13 46 24
33 35 30 18
12 22 23 27
31 21 26 44
47 10 36 49
22
Output:
14 13 46 *
* 35 * 18
12 * 23 27
* 21 * 44
47 10 36 *
Explanation:
The integers in the north-east, south-east, south-west and north-west directions of 22 are highlighted in the 5x4 matrix.
14 13 46 24
33 35 30 18
12 22 23 27
31 21 26 44
47 10 36 49
So those integers are replaced with asterisks (*) in the matrix.
Hence the output is
14 13 46 *
* 35 * 18
12 * 23 27
* 21 * 44
47 10 36 *
Example Input/Output 2:
Input: 4 4
31 73 29 87
77 44 66 46
90 9 10 43
3 1 39 34
10
Output:
* 73 29 87
77 * 66 *
90 9 * 43
3 * 39 *
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i = 0 ;i < r ;i ++){
		    for(int j = 0 ;j < c; j++){
		        arr[i][j] = sc.nextInt();
		    }
		}
        int k = sc.nextInt();
        int a=0 ,b=0;
        for(int i =0 ;i < r ; i++){
            for(int j = 0 ;j < c;j ++){
                if (arr[i][j] == k){
                    a = i ;
                    b =  j;
                    break;
                }
            }
        }
        for(int i =0 ;i < r ; i++){
            for(int j = 0 ;j < c; j ++){
                if (i+j==a+b || i-j==a-b)
                    System.out.print("* ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
