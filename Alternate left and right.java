/*
Input:
5
12 45 78 56 23
Output:
78 45 56 12 23
Explanation: The largest integer among the 5 integers is 78. So 78 is printed.
Then the remaining integers present in the left and right side of the largest integer 78 are printed alternatively (45 56 12 23).
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> b=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		    b.add(a[i]);
		}
		Arrays.sort(a);
		int max=a[n-1];
		int index=b.indexOf(max);
		System.out.print(max+" ");
		int printed=n-1;
		for(int i=index-1,j=index+1;printed!=0;)
        {
            if(i>=0)
            {
                System.out.print(b.get(i)+" ");
                i--;
                printed--;
            }
            if(j<n)
            {
                System.out.print(b.get(j)+" ");
                j++;
                printed--;
            }

        }

	}
}
