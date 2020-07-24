/*
input: 543X0
output: 2
input: 12X515
output: -1
input: X16
output: 2
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int tried = str.charAt(0)=='X'?1:0;
		int ind = str.indexOf("X");
		String fir = str.substring(0,ind);
		String las = str.substring(ind+1);
		while(tried!=10)
		{
		    if (Integer.valueOf(fir+tried+las)%8==0)
		    {
		        System.out.print(tried);
		        return;
		    }
		    tried++;
		}
        System.out.print(-1);
	}
}
