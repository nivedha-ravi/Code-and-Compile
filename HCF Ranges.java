/*
Input:
5 3
2 30 10 12 20
1 5
2 3
3 5
Output:
2
10
2
Explanation:
In the first range (1, 5), the HCF of the integers 2 30 10 12 20 is 2. So 2 is printed. In the second range (2, 3), the HCF of the integers 30 10 is 10. So 10 is printed. In the third range (3, 5), the HCF of the integers 10 12 20 is 2.
So 2 is printed.
*/
import java.util.*;
public class Hello {
    public static int findhcf(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return findhcf(b,a%b);
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<t;i++)
		{
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int result=a[x-1];
		    for(int j=x;j<y;j++)
		    {
		        result=findhcf(result,a[j]);
		    }
		    System.out.println(result);
		}


	}
}
