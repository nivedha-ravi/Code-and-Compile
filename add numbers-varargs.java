import java.util.Scanner;
public class Hello {
  public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = sc.nextInt();
  int D = sc.nextInt();
  int E = sc.nextInt();
  System.out.println(add(A, B));
  System.out.println(add(A, B, C));
  System.out.println(add(A, B, C, D));
  System.out.println(add(A, B, C, D, E));
  }
  public static int add(Integer... values)
  {
  int sum = 0;
  for (int val : values)
  {
    sum += val;
  }
  return sum;
  }
}
