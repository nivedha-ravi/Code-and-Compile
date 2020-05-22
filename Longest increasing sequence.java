/*
INPUT:
8
12 79 6 7 10 24 21 68
OUTPUT:
5
EXPLANATION:
The longest increasing sequence
6 7 10 24 68
6 7 10 21 68
INPUT:
58 50 50 41 24
OUTPUT:
1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=scan.nextInt();
         }
         int l[]=new int[n];
         l[0]=1;
         for(int i=1;i<n;i++)
         {
             l[i]=1;
             for(int j=0;j<n;j++)
             {
                 if(a[i]>a[j] && l[i]<l[j]+1)
                 l[i]=l[j]+1;
             }
         }
         Arrays.sort(l);
         System.out.print(l[l.length-1]);
	}
}
