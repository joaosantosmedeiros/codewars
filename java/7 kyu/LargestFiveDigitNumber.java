// https://www.codewars.com/kata/51675d17e0c1bed195000001
import java.util.Arrays;

public class LargestFiveDigitNumber {
  public static int solve(final String digits) {
    int[] numbers = new int[digits.length() - 4];
    for(int i = 0; i < numbers.length; i ++) {
      numbers[i] = Integer.parseInt(digits.substring(i, i + 5));
    }
    return Arrays.stream(numbers).max().orElse(0);
  }
}
