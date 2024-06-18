import java.util.Arrays;
import java.util.stream.Collectors;

public class DigitsExplosion {
  public static String explode(String digits) {
    return Arrays.stream(digits.split("")).map(n -> n.repeat(Integer.parseInt(n))).collect(Collectors.joining(""));
  }
}