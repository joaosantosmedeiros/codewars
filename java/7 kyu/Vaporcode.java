import java.util.Arrays;
import java.util.stream.Collectors;

public class Vaporcode {
  public static String vaporcode(String s) {
    return Arrays.stream(s.replaceAll(" ", "").toUpperCase().split("")).collect(Collectors.joining("  "));
  }
}