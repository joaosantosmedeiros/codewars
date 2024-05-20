import java.util.stream.IntStream;

public class RetanglesInGrid {

  public static int numberOfRectangles(int m, int n) {
    return IntStream.rangeClosed(1, n).sum() * IntStream.rangeClosed(1, m).sum();
  }

}