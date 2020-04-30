//*
INPUT:
4 4
o f y x
g a y b
j s u s
l d u f
OUTPUT:
*** *** *** ***

*o* *f* *y* *x*

*** *** *** ***


*** *** *** ***

*g* *a* *y* *b*

*** *** *** ***


*** *** *** ***

*j* *s* *u* *s*

*** *** *** ***


*** *** *** ***

*l* *d* *u* *f*

*** *** *** ***
*//
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		char matrix[][]=new char[x][y];
		for(int i=0;i<x;i++)
		{
		    for(int j=0;j<y;j++)
		    {
		        matrix[i][j]=in.next().charAt(0);
		    }
		}
        int k=0;
        for(int i=0;i<x;i++)
        {
            while(k<y)
            {
                System.out.print("*** ");
                k++;
            }
            System.out.println();
            for(int j=0;j<y;j++)
            {
                System.out.print("*"+matrix[i][j]+"* ");
            }
            System.out.println();
            while(k>0)
            {
                System.out.print("*** ");
                k--;
            }
            if(i!=x-1)
            {
                System.out.println();
                System.out.println();
            }
        }
	}
}
