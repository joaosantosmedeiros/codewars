// https://www.codewars.com/kata/58aed2cafab8faca1d000e20
import java.util.stream.IntStream;

public class ModifiedSum {
  public static int modifiedSum(int[] array, int power) {
    return IntStream.of(array).map(n -> (int) Math.pow(n, power)).sum() - IntStream.of(array).sum();
  }
}