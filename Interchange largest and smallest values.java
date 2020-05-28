/*
INPUT:
10
3 6 10 21 90 4 9001 89 43 333
OUTPUT:
9001 6 10 21 90 4 3 89 43 333
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
        if(a[i]==b[0])
        {
        System.out.print(b[n-1]+" ");
        }
        else if(a[i]==b[n-1])
        {
        System.out.print(b[0]+" ");
        }
        else
        {
        System.out.print(a[i]+" ");
        }
        }
	}
}
