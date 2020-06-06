/*
The program must accept N integers as the input. The program must print the integers among the N integers which occurs in the following series 2 3 5 9 17 33 65... as the output. If no integer occur in the series then the program must print -1 as the output.
Input:
7
6 5 14 129 17 65 85
Output:
5 129 17 65
Explanation:
The integers 5 129 17 65 are the values present in the given series. Hence they are printed as the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
        int b[]=new int[1000],k=0;
        for(int i=0;i<1000;i++)
        {
            b[k++]=(1<<i)+1;
        }
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    a[i]='\0';
                    p=1;
                }
            }
        }
        if(p==0)
        {
            System.out.print("-1");
        }
	}
}
