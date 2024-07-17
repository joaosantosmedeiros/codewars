// https://www.codewars.com/kata/5a63948acadebff56f000018
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MaxProductOfArray {
  public static long maxProduct(int[] numbers, int sub_size) {
    List<Integer> c = IntStream.of(numbers).boxed().collect(Collectors.toList());
    Collections.sort(c, Collections.reverseOrder());
    return LongStream.range(0, sub_size).map(i -> c.get((int) i)).reduce(1, (a, b) -> a * b);
  }
}