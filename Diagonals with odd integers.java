/*
Example Input/Output 1:
Input: 5 5
60 37 26 98 73
29 50 32 52 43
52 19 29 81 33
13 94 17 63 80
90 25 77 11 54
Output: 6
Explanation:
The diagonals that are parallel to the top-left to bottom-right diagonal and having only odd integers are highlighted below.
60 37 26 98 73
29 50 32 52 43
52 19 29 81 33
13 94 17 63 80
90 25 77 11 54
The diagonals that are parallel to the top-right to bottom-left diagonal and having only odd integers are highlighted below.
60 37 26 98 73
29 50 32 52 43
52 19 29 81 33
13 94 17 63 80
90 25 77 11 54
Here the total number of diagonals with only odd integers is 6. So 6 is printed as the output.
Example Input/Output 2:
Input: 4 3
354 234 259
104 384 352
331 289 127
127 261 288
Output: 4
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		Set<Integer > map = new HashSet<>();
		Set<Integer> map2 = new HashSet<>();
		for(int i = 0 ;i < r ; i++){
		    for(int j = 0 ;j < c; j ++){
		        arr[i][j] = sc.nextInt();
		        if (arr[i][j] %2==0){
		            map.add(i-j);
		            map2.add(i+j);
		        }
		    }
		}
		int ans =  2*(r+c-1)-map.size()-map2.size();
		System.out.println(ans);
	}
}

      or

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] matrix = new int[R][C];
		for(int i=0; i<R; i++)
		{
		    for(int j=0; j<C; j++)
		    {
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int count = 0;
		for(int i=0;i<R;i++)
		{
		    int col = 0;
		    int row = i;
		    int flag = 0;
		    while(row>=0 && col<C)
		    {
		        if(matrix[row][col] % 2 == 0)
		        {
		            flag = 1;
		            break;
		        }
		        col++;
		        row--;
		    }
		    if(flag == 0)
		    {
		        count++;
		    }
		}
        for(int j=1; j<C; j++)
        {
            int row = R-1;
            int col = j;
            int flag = 0;
            while(row>=0 && col<C)
            {
                if(matrix[row][col] % 2 == 0)
                {
                    flag = 1;
                    break;
                }
                col++;
                row--;
            }
            if(flag == 0)
            {
                count++;
            }
        }
        for(int j=C-1; j>=0; j--)
        {
            int row = 0;
            int col = j;
            int flag = 0;
            while(row<R && col<C)
            {
                if(matrix[row][col]%2==0)
                {
                    flag = 1;
                    break;
                }
                row++;
                col++;
            }
            if(flag == 0)
            {
                count++;
            }
        }
        for(int i=1; i<R; i++)
        {
            int row = i;
            int col = 0;
            int flag = 0;
            while(row<R && col<C)
            {
                if(matrix[row][col]%2==0)
                {
                    flag = 1;
                    break;
                }
                row++;
                col++;
            }
            if(flag == 0)
            {
                count++;
            }
        }

        System.out.println(count);
	}
}
