/*
Spectrum International School is located in DonnaVille. Chocolates are distributed on certain days (like a festival, independence day) to the N students present on that day. The number of chocolates to be distributed is C. The first student F to be given the chocolate is randomly chosen and the C chocolates are distributed one each to a student in sequence from F till they are emptied.
Given F, the program print the number of the student who receives the last chocolate.
Input Format:
First line contains total number of test cases, denoted by T Next T lines, contain a tuple containing 3 values delimited by space N C F, where - N denotes the number of students - C denotes the number of chocolates - F denotes the number of the student who receives the first chocolate.
Output Format:
The number of the student who receives the last chocolate.
Boundary Conditions / Constraints:
1 <= T <= 100
1 <= N <= 999999999
1 <= C <= 999999999
1 <= F <= N
Example Input/Output 1:
Input:
3
5 3 1
10 7 9
6 17 4
Output:
3
5
2
Explanation:
The first line in the input denotes there are 3 test cases.
In 5 3 1, the 3 chocolates are distributed to students with numbers 1,2,3. Hence 3 is the output.
In 10 7 9, the 7 chocolates are distributed to students with numbers 9 10 1 2 3 4 5. Hence 5 is the output.
In 6 17 4, the 17 chocolates are distributed to students with numbers 4 5 6 1 2 3 4 5 6 1 2 3 4 5 6 1 2. Hence 2 is the output.
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
		    long n=in.nextInt();
		    long c=in.nextInt();
		    long f=in.nextInt();
		    long count=0L;
		    for(long j=f;j<=n;j++)
		    {
		        count++;
		        if(count==c)
		        {
		            System.out.println(j);
		            break;
		        }
		        if(j==n)
		        {
		            j=0L;
		        }
		    }
		}

	}
}
