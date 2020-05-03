/*
INPUT:
6
14 53 65 79 65 53
53
OUTPUT:
14 53 65 79 65
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
        int k=in.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==k)
            {
                a[i]=-1;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {   if(a[i]!=-1)
        {
            System.out.print(a[i]+" ");
        }
        }


	}
}
