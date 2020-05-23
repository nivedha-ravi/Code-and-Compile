/*
INPUT:
20 530 11
OUTPUT:
14
INPUT:
31 79 1
OUTPUT:
5
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
  int y=sc.nextInt();
  int n=sc.nextInt();
  String s=Integer.toString(n);
  int count=0;
	for(int i=x;i<=y;i++)
	{
    String str=Integer.toString(i);
      if(str.contains(s))
	    {
	        count++;
	    }
	}
System.out.print(count);
}
