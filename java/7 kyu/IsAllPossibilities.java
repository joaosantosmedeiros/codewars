// https://www.codewars.com/kata/59b710ed70a3b7dd8f000027
import java.util.Arrays;
import java.util.stream.IntStream;

public class IsAllPossibilities {

  public static boolean isAllPossibilities(int[] arg) {
    if (arg.length == 0) {
      return false;
    }

    int[] x = IntStream.of(arg).distinct().sorted().filter(n -> n >= 0).toArray();
    int[] y = IntStream.range(0, arg.length).toArray();

    return Arrays.equals(x, y);
  }

}