
/*
Example Input/Output 1:
Input:
apple banana cherry banana dates apple apple
Output:
banana
Explanation:
The word repeated twice in the string "apple banana cherry banana dates apple apple" is banana. Hence the output is banana
Example Input/Output 2:
Input:
one two three two two three four three
Output:
-1
Example Input/Output 3:
Input:
dec jan feb mar jan feb mar
Output:
jan
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] s=str.split(" ");
		int n=s.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{   int count=0;
		    for(int j=0;j<n;j++)
		    {
		       if(s[i].equals(s[j]))
		       {
		           count++;
		       }
		    }
		    if(count==2 && flag!=1)
		    {
		        System.out.print(s[i]);
		        flag=1;
		        break;
		    }
		}
		if(flag==0)
		{
		    System.out.print("-1");
		}


	}
}
