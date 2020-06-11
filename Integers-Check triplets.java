/*
INPUT:
7
5 1 3 6 7 2 4
OUTPUT:
YES//if a^2+b^2=c^2
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt;
		}
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<n;k++)
        {
          if((a[i]*a[i])+(a[j]*a[j])==(a[k]*a[k]))
          {
            System.out.print("YES");
            System.exit(1);
          }
        }
      }
    }
    System.out.print("NO");

	}
}
