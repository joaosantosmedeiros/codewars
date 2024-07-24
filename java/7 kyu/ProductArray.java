// https://www.codewars.com/kata/5a905c2157c562994900009d
import java.util.Arrays;

public class ProductArray {
  public static long[] productArray(int[] numbers) {

    return Arrays.stream(numbers)
        .mapToLong(n -> Arrays.stream(numbers).mapToLong(i -> i).reduce(1, (a, b) -> a * b) / n)
        .toArray();
  }
}