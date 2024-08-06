//https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/solutions/java
import java.util.Arrays;

public class TheOffice {
  public static String outed(Person[] meet, String boss) {
    return Arrays.stream(meet)
      .mapToDouble(p -> p.name.equalsIgnoreCase(boss) ? p.happiness * 2d : p.happiness * 1d)
      .sum() / meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
  }
}