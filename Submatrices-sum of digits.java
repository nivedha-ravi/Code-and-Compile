/*
 The program must accept an integer matrix of size RxC as the input. The program must print all possible 2x2 submatrices where each integer should follow the below rule. - Each integer of the submatrix should be divisible by the sum of its digits. Note: At least one such submatrix is always present in the given matrix. Boundary Condition(s): 2 <= R, C <= 50 Input Format: The first line contains R and C separated by a space. The next R lines each contain C integers separated by a space. Output Format: The lines containing the 2x2 submatrices as per the given condition.
 Example Input/Output 1:
 Input:
 4 4
 18 19 72 42
 92 84 60 63
 12 50 93 35
 24 54 94 37
 Output:
 72 42
 60 63
 12 50
 24 54
 Explanation:
 The 2x2 submatrices where each integer of the submatrix is divisible by the sum of its digits are highlighted below. 18 19 72 42 92 84 60 63 12 50 93 35 24 54 94 37
 Example Input/Output 2:
 Input:
 4 3
 40 42 2
 30 24 27
 180 190 40
 11 121 13
 Output:
 40 42
 30 24
 30 24
 180 190
 24 27
 190 40
 */
import java.util.*;
public class Hello {
    public static int Sum(int num)
    {
        int temp=num,digsum=0;
        while(temp>0)
        {
            digsum+=temp%10;
            temp/=10;
        }
        if(num%digsum==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<r-1;i++)
		{
		    for(int j=0;j<c-1;j++)
		    {
		        int num1=Sum(a[i][j]);
		        int num2=Sum(a[i][j+1]);
		        int num3=Sum(a[i+1][j]);
		        int num4=Sum(a[i+1][j+1]);
		        if(num1==0 && num2==0 && num3==0 && num4==0)
		        {
		            System.out.println(a[i][j]+" "+a[i][j+1]);
		            System.out.println(a[i+1][j]+" "+a[i+1][j+1]);
		        }
		    }
		}

	}
}
