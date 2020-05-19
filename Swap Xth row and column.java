/*
INPUT:
4
1 3 0 7
2 4 6 8
9 1 7 5
7 0 0 6
2
OUTPUT:
1 2 0 7
3 4 1 0
9 6 7 5
7 8 0 6
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int x1[]=new int[n];
        int x2[]=new int[n];
        int k=0,l=0;
        int x=in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==x-1 && !(i==x-1 && j==x-1))
                {
                    x1[k++]=a[i][j];
                }
                if(j==x-1)
                {
                    x2[l++]=a[i][j];
                }
            }
        }
        int d=0,m=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==x-1)
                {
                    System.out.print(x2[d++]+" ");
                }
                else if(j==x-1)
                {
                    System.out.print(x1[m++]+" ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        }
}
