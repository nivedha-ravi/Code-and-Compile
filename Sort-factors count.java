/*
Example Input/Output 1:
Input:
50
Output: 50 10 25 5 2 1
Explanation:
The factors of 50 are 1, 2, 5, 10, 25 and 50. The integer 1 has 1 factor. The integer 2 has 2 factors. The integer 5 has 2 factors. The integer 10 has 4 factors. The integer 25 has 3 factors. The integer 50 has 6 factors. Here 2 and 5 have the same number of factors. So they are sorted in descending order. After sorting the factors of 50 in descending order based on their factors count, the factors become 50 10 25 5 2 1. So they are printed as the output.
Example Input/Output 2:
Input:
455
Output:
455 91 65 35 13 7 5 1
*/
import java.util.*;
public class Hello {
    public static int factorcount(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int at[]=new int[n];
		int k=0,p=0;
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		    {
		        a[p++]=i;
		        at[k++]=factorcount(i);
		    }
		}
		for(int i=0;i<p;i++)
		{
		    for(int j=i+1;j<p;j++)
		    {
		        if(at[i]<=at[j])
		        {
		            at[i]=at[i]+at[j];
		            at[j]=at[i]-at[j];
		            at[i]=at[i]-at[j];
		            a[i]=a[i]+a[j];
		            a[j]=a[i]-a[j];
		            a[i]=a[i]-a[j];
		        }
		    }
		    System.out.print(a[i]+" ");
		}



	}
}
