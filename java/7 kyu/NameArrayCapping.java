import java.util.Arrays;

public class NameArrayCapping {
  public static String[] capMe(String[] strings) {
    return Arrays.stream(strings).map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase()).toArray(String[]::new);
  }
}