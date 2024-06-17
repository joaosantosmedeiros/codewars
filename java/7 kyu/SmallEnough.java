// https://www.codewars.com/kata/57cc981a58da9e302a000214
import java.util.stream.IntStream;

public class SmallEnough {
  public static boolean smallEnough(int[] a, int limit) {
    return IntStream.of(a).allMatch(num -> num <= limit);
  }
}