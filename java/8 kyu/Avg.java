
// https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/
import java.util.stream.IntStream;

public class Avg {
  public static double find_average(int[] array) {
    return IntStream.of(array).average().orElse(0);
  }
}