// https://www.codewars.com/kata/58daa7617332e59593000006
import java.util.List;
import java.util.stream.IntStream;

public class MostDigits {
  public static int findLongest(int[] numbers) {
    List<Integer> lenghts = IntStream.range(0, numbers.length)
        .map(i -> Integer.toString(numbers[i]).replaceAll("[^0-9]", "").length())
        .boxed().toList();

    return numbers[(lenghts.indexOf(lenghts.stream().mapToInt(i -> i).max().orElse(0)))];
  }
}