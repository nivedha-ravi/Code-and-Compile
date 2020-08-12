/*
INPUT:
10578
OUTPUT:
10000 0 50000 70000 80000
1000 0 5000 7000 8000
100 0 500 700 800
10 0 50 70 80
1 0 5 7 8
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    long n=in.nextLong();
	    String str=String.valueOf(n);
	    int len=str.length()-1;
	    char arr[]=str.toCharArray();
	    while(len>=0)
	    {
	        for(int i=0;i<arr.length;i++)
	        {
	            int val=Character.getNumericValue(arr[i]);
	            System.out.print(val*((long)Math.pow(10,len))+" ");
	        }
	        System.out.println();
	        len--;
	    }



	}
}
