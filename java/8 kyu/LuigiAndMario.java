// https://www.codewars.com/kata/56b29582461215098d00000f
import java.util.stream.IntStream;

public class LuigiAndMario {
  public static int[] pipeFix(int[] numbers) {
    return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
}