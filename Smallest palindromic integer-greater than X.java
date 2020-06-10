/*
The program must accept an N unique digits and an integer X as the input.The program must print the smallest palindromic integer,which is formed from the given N digits and is greater then X.
INPUT:
3
2 4 0
567
OUTPUT:
2002
INPUT:
4
1 2 3 4
12545
OUTPUT:
13131
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
		int x=in.nextInt();
		int l=x+1;
		while(l>x)
		{
            int i=l;
            int count=0;
            if(String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString()))
            {
                String s=Integer.toString(i);
                int counter[]=new int[10];
                for(int j=0;j<s.length();j++)
                {
                    counter[s.charAt(j)-'0']++;
                }
		        for(int k=0;k<n;k++)
		        {
		            count+=counter[a[k]];
		        }
		        if(count==s.length())
		        {
		            System.out.print(l);
		            break;
		        }
            }
            l++;
		}
	}
}
