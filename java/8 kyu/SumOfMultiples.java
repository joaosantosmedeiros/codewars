
// https://www.codewars.com/kata/57241e0f440cd279b5000829
import java.util.stream.IntStream;

public class SumOfMultiples {
  public static long sumMul(int n, int m) {
    if (m < 1 || n < 1) {
      throw new IllegalArgumentException("");
    }
    return IntStream.range(0, m).filter(numb -> numb % n == 0).sum();
  }
}
