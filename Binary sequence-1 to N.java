/*
INPUT:
8
OUTPUT:
1 10 11 100 101 110 111 1000
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
		    String str=Integer.toBinaryString(i);
		    System.out.print(str+" ");
		}

	}
}
 import java.util.*;
 public class Hello {

     public static void main(String[] args) {
 		Scanner in=new Scanner(System.in);
 		int n=in.nextInt();
 		for(int i=1;i<=n;i++)
 		{
 		    String str="";
        while(i>0)
        {
        int y=i%2;
        str=str+y;
        i=i/2;
        }
 		    System.out.print(str+" ");
 		}

 	}
 }
