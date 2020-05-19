/*
INPUT:
4 2
OUTPUT:
YES
INPUT:
5 2
OUTPUT:
NO
INPUT:
19 3
OUTPUT:
YES
*/
import java.util.*;
public class Hello
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int div=n/k;
    if((n%2==0 && k%2==0 && div>=k)||(n%2!=0 && k%2!=0 && div>=k))
    {
      System.out.print("YES");
    }
    else
    {
      System.out.print("NO");
    }
  }
}
