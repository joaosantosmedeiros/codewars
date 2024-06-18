// https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java
import java.util.Arrays;
import java.util.stream.IntStream;

public class MinimumSumOfArray {
  public static int minSum(int[] passed) {
    Arrays.sort(passed);
    return IntStream.range(0, passed.length / 2).map(i -> passed[i] * passed[passed.length - i - 1]).sum();
  }
}