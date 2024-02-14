// https://www.codewars.com/kata/55edaba99da3a9c84000003b

import java.util.stream.IntStream;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    return IntStream.of(numbers).filter(n -> n % divider == 0).toArray();
  }
}