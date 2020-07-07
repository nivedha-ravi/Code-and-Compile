import java.util.Scanner;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String S1 = sc.nextLine();
    String S2 = sc.nextLine();
    String S3 = sc.nextLine();
    String S4 = sc.nextLine();
    String S5 = sc.nextLine();
    System.out.println(concat(S1, S2));
    System.out.println(concat(S1, S2, S3));
    System.out.println(concat(S1, S2, S3, S4));
    System.out.println(concat(S1, S2, S3, S4, S5));
  }
  public static String concat(String... values)
  {
    StringBuilder sb = new StringBuilder();
    for (String str : values)
    {
      sb.append(str);
    }
    return sb.toString();
    }
  }
