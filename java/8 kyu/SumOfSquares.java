// https://www.codewars.com/kata/515e271a311df0350d00000f
import java.util.stream.IntStream;

public class SumOfSquares {
  public static int squareSum(int[] n) {
    return IntStream.of(n).map(i -> i * i).sum();
  }
}