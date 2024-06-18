// https://www.codewars.com/kata/56484848ba95170a8000004d/
import java.util.stream.IntStream;

public class GpsSpeed {

  public static int gps(int s, double[] x) {
    return IntStream.range(0, x.length - 1).map(i -> ((int) (3600 * (x[i + 1] - x[i]) / s))).max().orElse(0);
  }
}