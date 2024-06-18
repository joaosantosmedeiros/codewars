// https://www.codewars.com/kata/556196a6091a7e7f58000018
import java.util.stream.IntStream;

public class LargestPairSum {

  public static int largestPairSum(int[] numbers) {
    int max = IntStream.of(numbers).max().orElse(0);
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == max) {
        numbers[i] = Integer.MIN_VALUE;
        break;
      }
    }
    return max + IntStream.of(numbers).max().orElse(0);
  }
}