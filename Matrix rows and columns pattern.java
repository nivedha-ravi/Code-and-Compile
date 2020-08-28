/*
Example Input/Output 1:
Input: 5 5
59 88 53 93 47
99 55 83 49 32
84 98 46 21 51
85 69 97 12 22
24 15 62 78 48
Output:
59 88 53 93 47
99 84 85 24
55 83 49 32
98 69 15
46 21 51
97 62
12 22
78
48
Explanation:
The integers in the first row of the matrix are 59, 88, 53, 93 and 47. So they are printed in the first line.
The integers in the first column of the matrix (excluding the first integer) are 99, 84, 85 and 24. So they are printed in the second line.
The integers in the second row of the matrix (excluding the first integer) are 55, 83, 49 and 32. So they are printed in the third line.
The integers in the second column of the matrix (excluding the first two integers) are 98, 69 and 15. So they are printed in the fourth line.
Similarly, the remaining integers of the matrix are printed.
Hence the output is
59 88 53 93 47
99 84 85 24
55 83 49 32
98 69 15
46 21 51
97 62
12 22
78
48
Example Input/Output 2:
Input: 3 4
8 6 9 5
1 45 67 99
3 50 6 9
Output:
8 6 9 5
1 3
45 67 99
50
6 9
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),c = sc.nextInt(),row = 0,col = 0;
		int[][] a = new int[r][c];
		for(int i = 0;i < r; i++)
		for(int j = 0;j < c; j++)
		a[i][j] = sc.nextInt();
		while(row < r && col < c) {
		    for(int i = col; i < c; i++)
		    System.out.print(a[row][i]+" ");
		    row++;
		    if(row < r)
		    System.out.println();
		    for(int i = row; i < r; i++)
		    System.out.print(a[i][col]+" ");
		    col++;
		    if(col < c)
		    System.out.println();
		}

	}
}
