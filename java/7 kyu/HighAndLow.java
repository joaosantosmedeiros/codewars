// https://www.codewars.com/kata/554b4ac871d6813a03000035
import java.util.Arrays;

public class HighAndLow {
  public static String highAndLow(String numbers) {
    int min = Arrays.stream(numbers.split(" ")).mapToInt(n -> Integer.parseInt(n)).min().orElse(0);
    int max = Arrays.stream(numbers.split(" ")).mapToInt(n -> Integer.parseInt(n)).max().orElse(0);
    return max + " " + min;
  }
}