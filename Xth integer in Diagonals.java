/*
The program must accept an integer of size N*N and an integer X as the input.The program must print the Xth integer in the diagonals(main and opposite diagonals) of the matrix as the output.
Note: The order of integers in the diagonals of the matrix must be all integers in the main diagonal from the top-left to bottom-right followed by all the integers in the opposite diagonal from the top-right to bottom-left.
INPUT:
4
7 0 1 3
5 8 2 6
7 4 5 2
8 6 3 4
3
OUTPUT:
5
EXPLANATION:
The order of integers in the diagonals of the matrix is given below
7 8 5 4 3 2 4 8
Here the #rd integer is 5.
Hence the output is 5.
*/import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int matrix[][]=new int[n][n];
		int arr[]= new int[n*2];
		int k=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        matrix[i][j]=in.nextInt();
		        if(i==j)
		        {
		            arr[k++]=matrix[i][j];
		        }
		    }
		}
		int num=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i+j==n-1)
		        {
		            arr[k++]=matrix[i][j];
		        }
		    }
		}
		System.out.print(arr[num-1]);

	}
}
