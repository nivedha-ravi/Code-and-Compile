import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double tShirtPrice = sc.nextDouble();
    String pattern = "#.###";
    NumberFormat fm = new DecimalFormat(pattern);
    System.out.println(fm.format(tShirtPrice));
    double goldRate = sc.nextDouble();
    String pattern = "000.000";
    NumberFormat fm = new DecimalFormat(pattern);
    System.out.println(fm.format(goldRate));
    int time = sc.nextInt();
    String pattern = "00,00,00";
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    dfs.setGroupingSeparator(':');
    NumberFormat fm = new DecimalFormat(pattern, dfs); 
    System.out.println(fm.format(time));
    }
}
