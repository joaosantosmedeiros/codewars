// https://www.codewars.com/kata/593c9175933500f33400003e
import java.util.stream.IntStream;

public class FirstMultiples {
  public static int[] multiples(int m, int n) {
    return IntStream.rangeClosed(1, m).map(number -> number * n).toArray();
  }
}