/*
Example Input/Output 1:
Input:
6 5 -1 -6 -2 -6 7
Output:
2
Explanation:
There are 2 employees with positive ratings and 4 employees with negative ratings.
One of the possible ways is given below.
The first team can be formed with 5 employees (5 -1 -2 -6 7).
The second team can be formed with 1 employee (-6).
Hence the output is 2.
Example Input/Output 2:
Input:
9 2 -5 -7 -2 -10 -3 -4 -6 -3
Output:
3
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		int pos=0,neg=0;
		for(int i=0;i<n;i++)
		{
		    a.add(in.nextInt());
		    if(a.get(a.size()-1)<0)
		    {
		        neg++;
		    }
		    else
		    {
		        pos++;
		    }
		}
        int totalteams=0;
        while(neg>0 || pos>0)
        {
            totalteams+=1;
            for(int i=0;i<5;i++)
            {
                if(i<3 && neg>0)
                {
                    neg--;
                }
                else
                {
                    pos--;
                }
            }
        }
        System.out.print(totalteams);
	}
}
