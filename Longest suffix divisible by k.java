/*
INPUT:
10554 9
OUTPUT:
54
INPUT:
674 8
OUTPUT:
-1
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	    int len = str.length();
	    int k = sc.nextInt();
	    int flag = 0;
	    for(int i=0; i<len; i++)
	    {
	        String temp = str.substring(i, len);
	        int n = Integer.parseInt(temp);
	        if(n % k ==0)
	        {
	            System.out.print(n);
	            flag=1;
	            return;
	        }
	    }
        if(flag==0)
        {
            System.out.print(-1);
        }
	}
}
