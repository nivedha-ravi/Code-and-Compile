/*
Example Input/Output 1:
Input: 2464538
Output: 3
Explanation:
The unit digit of 2464538 is 8.
The 3 unique pairs of digits are given below.
(2, 6) -> 2 + 6 = 8
(4, 4) -> 4 + 4 = 8
(5, 3) -> 5 + 3 = 8
Example Input/Output 2:
Input: 345672
Output: -1
Example Input/Output 3:
Input: 7117471178
Output: 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char[] ch=in.next().toCharArray();
		int len=ch.length;
		int unit=ch[len-1]-'0';
		int count=0;
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<len-1;i++)
		{
		    for(int j=i+1;j<len-1;j++)
		    {
		        if((ch[i]-'0')+(ch[j]-'0')==unit && !(a.contains(Math.abs((ch[i]-'0')-(ch[j]-'0')))))
		        {
		            a.add(Math.abs((ch[i]-'0')-(ch[j]-'0')));
		            count++;
		        }
		    }
		}
		System.out.print((count==0)?"-1":count);

	}
}
