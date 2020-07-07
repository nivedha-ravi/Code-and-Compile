import java.util.*;
public class Hello
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Map<Character, Integer> alphaFrequencyMap = null;
    alphaFrequencyMap = new TreeMap<>();
    for (Character ch : str.toCharArray())
    {
      int count = alphaFrequencyMap.getOrDefault(ch, 0);
      alphaFrequencyMap.put(ch, count + 1);
      }
      for (Map.Entry entry : alphaFrequencyMap.entrySet())
      {
        System.out.println(entry.getKey() + " " + entry.getValue());
      }
      }
      }
