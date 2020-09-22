/*
Example Input/Output 1:
Input:
6
120 45 67 81 78 35
Output:
26
Explanation:
The total number of bags in the row is 6. The number of boxes in the 6 bags are 3, 2, 2, 2, 2 and 2. He always selects a box with the least number of gold coins from the first bag. So he can select 0 from the 1st bag 120. Then he can select 4 from the 2nd bag 45 (4 > 0). Then he can select 6 from the 3rd bag 67 (6 > 4). Then he can select 8 from the 4th bag 81 (8 > 6). Then he can select 8 from the 5th bag 78 (8 >= 8). He cannot select any box from the 6th bag 35. So he skipped the last bag. The total number of gold coins in the selected boxes is 26 (0+4+6+8+8). So 26 is printed as the output.
Example Input/Output 2:
Input:
9
125 67 89 40 87 643 2468 456 78
Output:
39
Explanation:
The boxes that the boy can select are highlighted below. 125 -> 67 -> 89 -> 87 -> 2468 -> 78. The total number of gold coins in the selected boxes is 39 (1+6+8+8+8+8).
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		char[] ch=Integer.toString(x).toCharArray();
		Arrays.sort(ch);
		int min=ch[0]-'0';
		int sum=min;
		for(int i=1;i<n;i++)
		{
		    int num=in.nextInt();
		    char[] s=Integer.toString(num).toCharArray();
		    Arrays.sort(s);
		    for(int j=0;j<s.length;j++)
		    {
		        if(s[j]-'0'>=min)
		        {
		            sum+=s[j]-'0';
		            min=s[j]-'0';
		            break;
		        }
		    }
		}
		System.out.print(sum);

	}
}
