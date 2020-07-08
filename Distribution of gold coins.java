/*
INPUT:
 5
 10 20 45 30 25
 Output:
 11 21 41 31 26
 Explanation:
 The third plate contains the maximum number of gold coins 45. He can pick 1 gold coin from the third plate and add it to the second plate(left side). So the integer values become 10 21 44 30 25. Then he can pick 1 gold coin from the third plate and add it to the fourth plate(right side). So the integer values become 10 21 43 31 25. Then he can pick 1 gold coin from the third plate and add it to the first plate(left side). So the integer values become 11 21 42 31 25. Then he can pick 1 gold coin from the fourth plate and add it to the fifth plate(right side). So the integer values become 11 21 41 31 26. Now there are no plates to distribute the gold coins on either side. So the distribution is over. Hence the output is 11 21 41 31 26
 Example Input/Output 2:
 Input:
 6
 10 15 20 13 90 18
 Output:
 11 16 21 14 85 19
 Example Input/Output 3:
 Input:
 10
 1 2 3 4 6 1 2 3 4 1
 Output:
 1 3 4 5 0 2 3 4 4 1
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
        int maxindex=0,max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                maxindex=i;
                max=a[i];
            }
        }
        int i=maxindex-1;
        int j=maxindex+1;
        while(a[maxindex]!=0)
        {
                if(i>=0)
                {
                a[maxindex]=a[maxindex]-1;
                a[i]=a[i]+1;
                i--;
                }
                if(j<n)
                {
                    a[maxindex]=a[maxindex]-1;
                    a[j]=a[j]+1;
                    j++;
                }
                if(a[maxindex]==0 || (i<0 && j==n))
                {
                    break;
                }

        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
	}
}
