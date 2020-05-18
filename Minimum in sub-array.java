/*
INPUT:
6 3
9 5 3 4 6 2
1 3
2 6
3 5
OUTPUT:
3
2
3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
	    int i=0;
	    while(i<q)
	    {
		   int b=in.nextInt();
		   int c=in.nextInt();
		   int min=a[b-1];
            for(int l=b;l<c;l++)
            {
                if(a[l]<min)
                {
                    min=a[l];
                }
            }
            System.out.println(min);
            i++;

        }
	}
}
