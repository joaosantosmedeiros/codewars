
// https://codewars.com/kata/5a00e05cc374cb34d100000d
import java.util.stream.IntStream;

public class Sequence {

  public static int[] reverse(int n) {
    return IntStream.rangeClosed(1, n).boxed().sorted((a, b) -> b - a).mapToInt(i -> i).toArray();
  }

}