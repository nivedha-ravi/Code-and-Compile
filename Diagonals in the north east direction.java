/*
Input:
3 3
73 77 76
71 17 87
37 73 98
Output:
73
71 77
37 17 76
73 87
98
Explanation:
There are 5 diagonals in the North-East direction. The integer in the first diagonal is 73.
The integers in the second diagonal are 71 and 77.
The integers in the third diagonal are 37, 17 and 76.
The integers in the fourth diagonal are 73 and 87.
The integer in the fifth diagonal is 98. Hence the output is 73 71 77 37 17 76 73 87 98
Example Input/Output 2:
Input:
4 6
97 78 7 39 92 45
68 100 49 95 97 100
59 41 81 22 26 100
46 37 81 12 93 10
Output:
97
68 78
59 100 7
46 41 49 39
37 81 95 92
81 22 97 45
12 26 100
93 100
10
*/
import java.util.*;
public class Hello {

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
        int i=0,j=0,k=0;
        while(i<r)
        {
            for(int p=i,q=0;p>=0 && q<c;p--,q++)
            {
                System.out.print(a[p][q]+" ");
            }
            i++;
            j++;
            System.out.println();
        }
	i=r-1;
	k=1;
	while(j<(r+c)-1)
	{
	    for(int p=i,q=k;p>=0 && q<c;p--,q++)
	    {
	        System.out.print(a[p][q]+" ");
	    }
	    j++;
	    k++;
	    System.out.println();
	}
    }

}
