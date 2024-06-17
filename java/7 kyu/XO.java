// https://www.codewars.com/kata/55908aad6620c066bc00002a
import java.util.List;

public class XO {
  public static boolean getXO (String str) {
    List<String> letters = str.chars().mapToObj(c -> Character.toString(c)).toList();
    int x = (int) letters.stream().filter(l -> l.equalsIgnoreCase("x")).count();
    int o = (int) letters.stream().filter(l -> l.equalsIgnoreCase("o")).count();
    return x == o;
  }
}