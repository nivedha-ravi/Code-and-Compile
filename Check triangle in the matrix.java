/*
Example Input/Output 1:
Input: 7 3
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
Output: YES
Explanation:
In the top of the given 7x7 matrix, a triangle with the integer 3 in its border is highlighted below.
8 5 3 3 6 7 4
4 0 3 0 3 4 3
3 3 7 5 9 3 4
3 3 3 3 3 3 3
7 4 7 6 5 0 4
2 8 4 2 8 9 9
4 6 5 4 8 7 3
So YES is printed as the output.
Example Input/Output 2:
Input: 5 0
7 8 0 4 7
1 0 5 0 8
0 0 1 0 0
4 5 8 6 3
0 1 3 7 3
Output: NO
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        Set<Integer> s=new TreeSet<Integer>();
        int h=n/2,y=0;
        int m[]=new int[n*2];
        m[y++]=a[0][h];
        int r=1,c=h-1;
        while(r<=n/2 && c>=0)
        {
            m[y++]=a[r++][c--];
        }
        r=1;
        c=h+1;
        while(r<n && c<n)
        {
            m[y++]=a[r++][c++];

        }
        for(int i=0;i<n;i++)
        {
            m[y++]=a[h][i];
        }
        int i=0,ans=0;
        for(int d:m)
        {
            if(i==0)
            {
                ans=d;
            }
            s.add(d);
            i++;
        }
        if(s.size()==1 && ans==k)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }


	}
}
