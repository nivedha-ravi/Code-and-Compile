/*
INPUT:
164
OUTPUT:
0D 00:02:04
INPUT:
96408
OUTPUT:
1D 02:46:48
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
        int day=n/(24*3600);
        n=n%(24*3600);
        int hour=n/3600;
        n=n%3600;
        int min=n/60;
        n=n%60;
        int sec=n;
        System.out.printf(day+"D "+"%02d:%02d:%02d",hour,min,sec);
	}
}
