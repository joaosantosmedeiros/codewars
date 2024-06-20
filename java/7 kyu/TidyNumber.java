// https://www.codewars.com/kata/5a87449ab1710171300000fd
import java.util.Arrays;
import java.util.stream.IntStream;

public class TidyNumber {
  // Elegant
  public static boolean tidyNumber(int number) {
    int[] digits = Arrays.stream(String.valueOf(number).split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
    return IntStream.range(0, String.valueOf(number).length() - 1).allMatch(i -> digits[i] < digits[i + 1]);
  }

  // Faster
  public static boolean tidyNumber2(int number) {
    int[] digits = Arrays.stream(String.valueOf(number).split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
    for (int i = 0; i < digits.length - 1; i++) {
      if (digits[i] > digits[i + 1])
        return false;
    }
    return true;
  }
}