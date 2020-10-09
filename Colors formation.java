/*
Example Input/Output 1:
Input:
5
1 5 3 2 4 2 5
Output: 2
Explanation:
Here X=2 and Y=5.
There are two ways to form the color 5 by mixing exactly 2 colors.
1 + 4 = 5
3 + 2 = 5
So 2 is printed as the output.
Example Input/Output 2:
Input:
8 6 4 2 5 8 7 3 1
3 15
Output: 6
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] colors=new int[N];
		for(int index=0;index<N;index++){
		    colors[index]=sc.nextInt();
		}
		int color=0;
		int X=sc.nextInt();
		int Y=sc.nextInt();
		for(int ctr=1;ctr<=(1<<N);ctr++){
		    int count=0,sum=0;
		    for(int index=0;index<N;index++){
		        if((ctr & (1<<index))>0){
		            sum+=colors[index];
		            count++;
		        }
		    }
		    if(count==X && sum==Y){
		        color++;
		    }
		}
		System.out.println(color);
	}
}
