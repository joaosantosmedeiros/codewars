// https://www.codewars.com/kata/55d24f55d7dd296eb9000030
import java.util.stream.IntStream;

public class GrassHopper {
  public static int summation(int n) {
    return IntStream.rangeClosed(1, n).sum();
  }
}