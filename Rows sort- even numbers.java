/*
Example Input/Output 1:
Input:
3 4
1 2 4 5
4 9 8 6
9 7 8 5
Output:
9 7 8 5
1 2 4 5
4 9 8 6
Explanation:
The number of even integers in the 1st row of the matrix is 2 (1 2 4 5).
The number of even integers in the 2nd row of the matrix is 3 (4 9 8 6).
The number of even integers in the 3rd row of the matrix is 1 (9 7 8 5).
After sorting the rows of the matrix based on the number of even integers, the matrix becomes 9 7 8 5 1 2 4 5 4 9 8 6
Example Input/Output 2:
Input:
5 5
84 48 94 18 79
35 97 13 75 91
99 48 53 37 99
36 13 38 10 15
93 55 25 94 41
Output:
35 97 13 75 91
99 48 53 37 99
93 55 25 94 41
36 13 38 10 15
84 48 94 18 79
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int m=in.nextInt();
	    int a[][]=new int[n][m];
	    int evencount[]=new int[n];
	    int row[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        int count=0;
	        for(int j=0;j<m;j++)
	        {
	            a[i][j]=in.nextInt();
	            if(a[i][j]%2==0)
	            {
	                count++;
	            }
	        }
	        evencount[i]=count;
	        row[i]=i;
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(evencount[i]==evencount[j])
	            {
	                if(row[i]>row[j])
	                {
	                    int temp=row[i];
	                    row[i]=row[j];
	                    row[j]=temp;
	                }
	            }
	            else if(evencount[i]>evencount[j])
	            {
	                int temp=evencount[i];
	                evencount[i]=evencount[j];
	                evencount[j]=temp;
	                int temp1=row[i];
	                row[i]=row[j];
	                row[j]=temp1;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	            System.out.print(a[row[i]][j]+" ");
	        }
	        System.out.println();
	    }


	}
}
