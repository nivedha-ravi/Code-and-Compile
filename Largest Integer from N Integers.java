/*
INPUT:
4
12 19 546 60
OUTPUT:
605461912
*/
import java.util.*;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String[] q=new String[n];
    for(int i=0;i<n;i++)
    {
      q[i]=in.next();
    }
    Arrays.sort(q);
    for(int i=n-1;i>=0;i--)
    {
      System.out.print(q[i]);
    }
  }
}
