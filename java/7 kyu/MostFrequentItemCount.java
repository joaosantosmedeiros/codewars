// https://www.codewars.com/kata/56582133c932d8239900002e
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostFrequentItemCount {
  public static int mostFrequentItemCount(int[] collection) {
    return IntStream.of(collection).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .values().stream()
        .mapToInt(i -> Math.toIntExact(i))
        .max().orElse(0);
  }
}