/*
INPUT:
6
12 45 51 10 63 17
OUTPUT:
12
63 17
45 51 10
INPUT:
7
50 25 18 23 90 75 2
OUTPUT:
50
75 2
25 18 23
90
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int arr[] = new int[num ] ;
		for(int ctr = 0 ; ctr < num ; ctr++ )
		    arr[ctr] = sc.nextInt();
	    int ctr = 1;
	    int start = 0 ;
	    int end = num -1;
	    boolean flag = true ;
	    while (start <=end)
	    {
	        int index = 0 ;
	        int temp [] = new int[100];
	        for (int i=0;i<ctr ; i++)
	        {
	            if (start<=end)temp[index++]=arr[flag?start++:end--];
	        }
	        for(int ind = 0 ; ind < index ; ind++)
	            System.out.print(temp[flag ?ind:index-ind-1]+ " ");
            System.out.println();
	        ctr++;
	        flag = ! flag;
	    }

	}
}
